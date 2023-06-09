package com.company.designpatterns.command;

import com.company.designpatterns.builder.Home;
import com.company.designpatterns.factory.HomeFactory;
import com.company.designpatterns.factory.HomeWithGardenFactory;

public class HomeWithGardenCommand implements HomeCommand{

    private final HomeFactory homeFactory = new HomeWithGardenFactory();

    @Override
    public Home execute() {
        return this.homeFactory.createHome();
    }
}
