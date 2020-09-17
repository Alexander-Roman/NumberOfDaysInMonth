package com.epam.daycalc.factory;

import com.epam.daycalc.data.DateProvider;

public interface DateProviderFactory {

    DateProvider createDateProvider();
}
