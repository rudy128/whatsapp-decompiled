package X;

import com.facebook.quicklog.EventBuilder;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* renamed from: X.AIp  reason: case insensitive filesystem */
public class C20379AIp implements EventBuilder {
    public final C20380AIq A00;
    public final ArrayList A01 = AnonymousClass000.A13();

    public boolean isSampled() {
        return true;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass9UX(obj));
    }

    public void report() {
        C20380AIq.A00(this.A00, this, (Object) null);
    }

    public EventBuilder setActionId(short s) {
        A00(Short.valueOf(s), this.A01);
        return this;
    }

    public EventBuilder setLevel(int i) {
        A00(Integer.valueOf(i), this.A01);
        return this;
    }

    public C20379AIp(C20380AIq aIq) {
        this.A00 = aIq;
    }

    public EventBuilder annotate(String str, double d) {
        A00(Double.valueOf(d), this.A01);
        return this;
    }

    public EventBuilder annotate(String str, int i) {
        A00(Integer.valueOf(i), this.A01);
        return this;
    }

    public EventBuilder annotate(String str, long j) {
        A00(Long.valueOf(j), this.A01);
        return this;
    }

    public EventBuilder annotate(String str, String str2) {
        A00(str2, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, boolean z) {
        A00(Boolean.valueOf(z), this.A01);
        return this;
    }

    public EventBuilder annotate(String str, double[] dArr) {
        A00(dArr, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, int[] iArr) {
        A00(iArr, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, long[] jArr) {
        A00(jArr, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, String[] strArr) {
        A00(strArr, this.A01);
        return this;
    }

    public EventBuilder annotate(String str, boolean[] zArr) {
        A00(zArr, this.A01);
        return this;
    }
}
