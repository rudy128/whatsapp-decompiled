package X;

import java.util.regex.Pattern;

public abstract class CEP {
    public static final Pattern A00 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
}
