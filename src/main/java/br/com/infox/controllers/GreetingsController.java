package br.com.infox.controllers;

import br.com.infox.model.Cliente;
import br.com.infox.model.Usuario;
import br.com.infox.repository.ClienteRepository;
import br.com.infox.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping(value = "salvarusuario")
    @ResponseBody
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario){

        Usuario novoUsuario = usuarioRepository.save(usuario);

        return new ResponseEntity<Usuario>(novoUsuario, HttpStatus.CREATED);

    }

    @GetMapping(value = "listarusuarios")
    @ResponseBody
    public ResponseEntity<List<Usuario>> listarUsuarios(){

        List<Usuario> usuarios = usuarioRepository.findAll();

        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);

    }

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping(value = "salvarcliente")
    @ResponseBody
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente){

        Cliente novoCliente = clienteRepository.save(cliente);

        return new ResponseEntity<Cliente>(novoCliente, HttpStatus.CREATED);
    }

}
