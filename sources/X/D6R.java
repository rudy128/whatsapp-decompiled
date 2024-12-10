package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

public final class D6R implements E9Z {
    public final int A00;
    public final int A01;
    public final ClipData A02;
    public final Uri A03;
    public final Bundle A04;

    public ContentInfo Bbu() {
        return null;
    }

    public ClipData BOm() {
        return this.A02;
    }

    public int BRq() {
        return this.A00;
    }

    public int BZT() {
        return this.A01;
    }

    public Bundle getExtras() {
        return this.A04;
    }

    public Uri getLinkUri() {
        return this.A03;
    }

    public D6R(D6O d6o) {
        ClipData clipData = d6o.A02;
        C28111Yx.A02(clipData);
        this.A02 = clipData;
        int i = d6o.A01;
        C28111Yx.A01(i, 0, "source", 5);
        this.A01 = i;
        int i2 = d6o.A00;
        if ((i2 & 1) == i2) {
            this.A00 = i2;
            this.A03 = d6o.A03;
            this.A04 = d6o.A04;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        BE9.A1J("Requested flags 0x", A10, i2);
        BE9.A1J(", but only 0x", A10, 1);
        throw AnonymousClass001.A12(" are allowed", A10);
    }

    public String toString() {
        String str;
        String valueOf;
        String A0q;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContentInfoCompat{clip=");
        A10.append(this.A02.getDescription());
        A10.append(", source=");
        int i = this.A01;
        if (i == 0) {
            str = "SOURCE_APP";
        } else if (i == 1) {
            str = "SOURCE_CLIPBOARD";
        } else if (i == 2) {
            str = "SOURCE_INPUT_METHOD";
        } else if (i == 3) {
            str = "SOURCE_DRAG_AND_DROP";
        } else if (i == 4) {
            str = "SOURCE_AUTOFILL";
        } else if (i != 5) {
            str = String.valueOf(i);
        } else {
            str = "SOURCE_PROCESS_TEXT";
        }
        A10.append(str);
        A10.append(", flags=");
        int i2 = this.A00;
        if ((i2 & 1) != 0) {
            valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
        } else {
            valueOf = String.valueOf(i2);
        }
        A10.append(valueOf);
        Uri uri = this.A03;
        String str2 = "";
        if (uri == null) {
            A0q = str2;
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append(", hasLinkUri(");
            A102.append(uri.toString().length());
            A0q = AnonymousClass8BU.A0q(A102);
        }
        A10.append(A0q);
        if (this.A04 != null) {
            str2 = ", hasExtras";
        }
        return BEA.A0n(str2, A10);
    }
}
