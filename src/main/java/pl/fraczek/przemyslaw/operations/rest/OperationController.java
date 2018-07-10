package pl.fraczek.przemyslaw.operations.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.fraczek.przemyslaw.operations.domain.OperationService;
import pl.fraczek.przemyslaw.operations.domain.dto.OperationDto;

@RequestMapping("/operation")
@RestController
public class OperationController {
    @Autowired
    private OperationService service;

    @RequestMapping(method = RequestMethod.PUT)
    public Long crate(@ModelAttribute OperationDto operationDto) {
        return service.create(operationDto);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public OperationDto get (@PathVariable Long id){
        return service.get(id);
    }

}
