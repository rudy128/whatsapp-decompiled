package com.google.android.play.core.integrity;

import android.content.Context;

public class IntegrityManagerFactory {
    public static IntegrityManager create(Context context) {
        return z.a(context).a();
    }

    public static StandardIntegrityManager createStandard(Context context) {
        return ax.a(context).a();
    }
}
