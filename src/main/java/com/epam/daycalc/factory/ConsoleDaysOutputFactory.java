package com.epam.daycalc.factory;

import com.epam.daycalc.view.ConsoleDaysOutput;
import com.epam.daycalc.view.DaysOutput;

public class ConsoleDaysOutputFactory implements DaysOutputFactory {

    @Override
    public DaysOutput createDaysOutput() {
        return new ConsoleDaysOutput();
    }
}
