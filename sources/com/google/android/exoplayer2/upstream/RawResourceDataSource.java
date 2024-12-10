package com.google.android.exoplayer2.upstream;

import X.AnonymousClass000;
import X.AnonymousClass001;
import android.net.Uri;

public abstract class RawResourceDataSource {
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse(AnonymousClass001.A1I("rawresource:///", AnonymousClass000.A10(), i));
    }
}
