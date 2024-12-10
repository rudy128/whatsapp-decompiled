package com.facebook.quicklog;

import X.DSU;

public interface QuickEventFilter {
    boolean shouldRemove(DSU dsu);
}
