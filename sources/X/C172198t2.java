package X;

import org.json.JSONObject;

/* renamed from: X.8t2  reason: invalid class name and case insensitive filesystem */
public abstract class C172198t2 extends C20462ALz {
    public final C18000vb A00;
    public final C183279Xq A01;
    public final C24521Kq A02;

    public C172198t2(AnonymousClass190 r10, C22416B6y b6y, C24521Kq r12, C18000vb r13, C22508BAp bAp, C191659mx r15, C19989A2b a2b, C183279Xq r17, AnonymousClass10I r18) {
        super(r10, b6y, bAp, r15, a2b, r18, "WA_BizAPIGlobalSearch");
        this.A00 = r13;
        this.A01 = r17;
        this.A02 = r12;
    }

    public static JSONObject A02(C193899qq r3) {
        JSONObject A15 = C17880vN.A15();
        A15.put("page_size", r3.A00);
        A15.put("page_id", r3.A01);
        return A15;
    }
}
