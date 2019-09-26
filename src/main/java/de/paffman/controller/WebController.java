package de.paffman.controller;

import de.paffman.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/my-domain")
public class WebController {

    @Autowired
    DummyService dummyService;


    @GetMapping(path = "/entity/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> checkEntity(@PathVariable("id") Integer id) {
        Boolean result = dummyService.checkId(id);
        return ResponseEntity.accepted().body(result);
    }
}
