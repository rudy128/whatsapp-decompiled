package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1jz  reason: invalid class name and case insensitive filesystem */
public class C34141jz {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass1BI A03;
    public AnonymousClass77M A04;
    public C188079gq A05;
    public AnonymousClass77Z A06;
    public Boolean A07 = null;
    public Boolean A08 = null;
    public List A09;
    public List A0A = null;
    public List A0B;
    public List A0C;
    public List A0D;
    public Map A0E;
    public boolean A0F = true;
    public boolean A0G = true;
    public C19760yx A0H;
    public CharSequence A0I;
    public final Object A0J = new Object();
    public final C18000vb A0K;

    private C19760yx A00() {
        C19760yx A002;
        if (TextUtils.isEmpty(this.A0I)) {
            A002 = new C19760yx(new ArrayList(), new ArrayList());
        } else {
            A002 = C20103A7h.A00(this.A0K, A02(), false);
        }
        this.A0H = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A01() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A08
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34141jz.A01():java.lang.Boolean");
    }

    public String A02() {
        if (this.A0I == null) {
            C19760yx r0 = this.A0H;
            if (r0 == null) {
                return "";
            }
            Object obj = r0.A01;
            C17960vV.A07(obj);
            if (((List) obj).isEmpty()) {
                return "";
            }
        }
        CharSequence charSequence = this.A0I;
        if (charSequence == null) {
            return TextUtils.join(" ", A04());
        }
        return charSequence.toString();
    }

    public List A03() {
        List list;
        C19760yx r0 = this.A0H;
        if (r0 != null && (list = (List) r0.A00) != null && !list.isEmpty()) {
            return list;
        }
        Object obj = A00().A00;
        C17960vV.A07(obj);
        return (List) obj;
    }

    public List A04() {
        List list;
        C19760yx r0 = this.A0H;
        if (r0 != null && (list = (List) r0.A01) != null && !list.isEmpty()) {
            return list;
        }
        Object obj = A00().A01;
        C17960vV.A07(obj);
        return (List) obj;
    }

    public void A05(CharSequence charSequence) {
        this.A0I = charSequence;
        this.A0H = null;
    }

    public void A06(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (this.A0H == null) {
            this.A0H = new C19760yx(new ArrayList(), list);
        }
        this.A0I = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n\tnormal: \"");
        sb.append(A02());
        sb.append("\";\ttokens: ");
        sb.append(A04());
        sb.append("\n\tlabel: \"");
        Object obj = this.A0D;
        if (obj == null) {
            obj = new ArrayList();
        }
        sb.append(obj);
        sb.append("\";\tjid: ");
        sb.append(this.A03);
        sb.append("\";\tstarred: ");
        sb.append(A01());
        sb.append("\n\tpage: ");
        sb.append(this.A00);
        sb.append("; pageSize: ");
        sb.append(this.A01);
        sb.append("\n\tcontact filters:");
        sb.append(this.A09);
        sb.append("\n\tcontact prefilters:");
        sb.append(this.A0A);
        sb.append("\n\tmapping: ");
        sb.append(A03());
        return sb.toString();
    }

    public C34141jz(C18000vb r2) {
        this.A0K = r2;
    }
}
