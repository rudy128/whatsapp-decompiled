package X;

import com.whatsapp.util.Log;

/* renamed from: X.1cz  reason: invalid class name and case insensitive filesystem */
public final class C29861cz {
    public boolean A00;
    public final String A01;

    public C29861cz(String str, boolean z) {
        this.A01 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" initialize to ");
        sb.append(z);
        Log.log(3, sb.toString());
        this.A00 = z;
    }

    public final void A00(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(' ');
        sb.append(this.A00);
        sb.append(" change to ");
        sb.append(z);
        Log.log(3, sb.toString());
        this.A00 = z;
    }

    public final boolean A01() {
        return this.A00;
    }
}
