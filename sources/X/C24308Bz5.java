package X;

import java.util.Map;

/* renamed from: X.Bz5  reason: case insensitive filesystem */
public enum C24308Bz5 {
    target,
    root,
    nth_child,
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    first_child,
    last_child,
    first_of_type,
    last_of_type,
    only_child,
    only_of_type,
    empty,
    not,
    lang,
    link,
    visited,
    hover,
    active,
    focus,
    enabled,
    disabled,
    checked,
    indeterminate,
    UNSUPPORTED;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = C17880vN.A11();
        for (C24308Bz5 bz5 : values()) {
            if (bz5 != UNSUPPORTED) {
                A00.put(bz5.name().replace('_', '-'), bz5);
            }
        }
    }
}
