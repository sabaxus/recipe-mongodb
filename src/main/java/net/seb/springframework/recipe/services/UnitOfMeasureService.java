package net.seb.springframework.recipe.services;

import net.seb.springframework.recipe.commands.UnitOfMeasureCommand;

import java.util.Set;


public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
