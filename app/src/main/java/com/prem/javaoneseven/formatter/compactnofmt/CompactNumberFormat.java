package com.prem.javaoneseven.formatter.compactnofmt;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

    public static void main(String[] args) {
        //todo:: A factory method is added to NumberFormat in order to format numbers in
        // compact, human-readable form according to the Unicode standard. The SHORT format
        // style is shown in the code below:
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH,
                NumberFormat.Style.SHORT);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));

        //The LONG format style:
        fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH,
                NumberFormat.Style.LONG);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));

        //The LONG format in Dutch instead of in English:
        fmt = NumberFormat.getCompactNumberInstance(Locale.forLanguageTag("NL"),
                NumberFormat.Style.LONG);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));

    }


}
