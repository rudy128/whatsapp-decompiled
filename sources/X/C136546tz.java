package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.6tz  reason: invalid class name and case insensitive filesystem */
public final class C136546tz {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public String A03;
    public List A04;
    public List A05;
    public List A06;
    public Map A07;
    public Map A08;
    public final Context A09;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136546tz) && C18070vi.A18(this.A09, ((C136546tz) obj).A09));
    }

    public int hashCode() {
        return this.A09.hashCode();
    }

    public C136546tz(Context context) {
        this.A09 = context;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PushPsaNotificationInfo(applicationContext=");
        return AnonymousClass001.A1F(this.A09, A10);
    }
}
