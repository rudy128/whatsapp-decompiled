package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2k6  reason: invalid class name and case insensitive filesystem */
public class C58072k6 {
    public Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public C58072k6 A00() {
        ArrayList arrayList;
        String str = this.A02;
        String str2 = this.A03;
        List list = this.A06;
        if (list != null) {
            arrayList = C17880vN.A10(list);
        } else {
            arrayList = null;
        }
        return new C58072k6(this.A00, str, str2, this.A05, this.A01, this.A04, arrayList, this.A07);
    }

    public C58072k6(Long l, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A06 = list;
        this.A05 = str3;
        this.A00 = l;
        this.A01 = str4;
        this.A04 = str5;
        this.A07 = z;
    }
}
