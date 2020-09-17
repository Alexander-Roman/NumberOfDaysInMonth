package com.epam.daycalc.factory;

import com.epam.daycalc.data.ConsoleDateProvider;
import com.epam.daycalc.data.DateProvider;

public class ConsoleDateProviderFactory implements DateProviderFactory {

    @Override
    public DateProvider createDateProvider() {
        return new ConsoleDateProvider();
    }
}
