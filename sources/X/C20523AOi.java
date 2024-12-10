package X;

import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: X.AOi  reason: case insensitive filesystem */
public class C20523AOi implements C22418B7a {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9A6, X.8te] */
    public static AnonymousClass9A6 A00(AnonymousClass181 r14, C19830z4 r15, C18000vb r16, C18030ve r17, C31611fq r18, AnonymousClass11W r19, AnonymousClass00H r20, String str, String str2, C18140vp r23, C18140vp r24, long j) {
        C19830z4 r7 = r15;
        int intValue = Integer.valueOf(r15.A0l()).intValue();
        Charset charset = AnonymousClass1K3.A06;
        Object obj = AnonymousClass1K4.A01.get(intValue);
        if (obj != null) {
            try {
                return new C172578te(r14, r7, r16, r17, r18, r19, r20, str, str2, C17880vN.A15().put("params", C17880vN.A15().put("server_params", C17880vN.A15().put("country_iso_graphql", obj))).toString(), r23, r24, j);
            } catch (JSONException e) {
                throw AnonymousClass8BR.A0x(e);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public C20523AOi(AnonymousClass10F r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ C172578te BHl(String str, String str2, String str3, long j) {
        int i = this.A00;
        AnonymousClass10E r0 = ((AnonymousClass10F) this.A01).A00;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        long j2 = j;
        switch (i) {
            case 0:
                C18030ve A8r = AnonymousClass10E.A8r(r0);
                AnonymousClass11W A0e = AnonymousClass8BU.A0e(r0);
                AnonymousClass181 A0H = C108965cb.A0H(r0);
                C18000vb A6Q = AnonymousClass10E.A6Q(r0);
                C19830z4 A0c = AnonymousClass3Ma.A0c(r0);
                return new C168988k5(A0H, AnonymousClass8BU.A0F(r0), A0c, A6Q, A8r, C108955ca.A0X(r0), A0e, C108945cZ.A14(r0), str5, str6);
            case 1:
                C18030ve A8r2 = AnonymousClass10E.A8r(r0);
                AnonymousClass11W A0e2 = AnonymousClass8BU.A0e(r0);
                AnonymousClass181 A0H2 = C108965cb.A0H(r0);
                C18000vb A6Q2 = AnonymousClass10E.A6Q(r0);
                return new C172578te(A0H2, AnonymousClass3Ma.A0c(r0), A6Q2, A8r2, C108955ca.A0X(r0), A0e2, C108945cZ.A14(r0), str4, str5, str6, C21517AlQ.A00(34), C21517AlQ.A00(35), j2);
            case 2:
                C18030ve A8r3 = AnonymousClass10E.A8r(r0);
                C18000vb A6Q3 = AnonymousClass10E.A6Q(r0);
                AnonymousClass11W A0e3 = AnonymousClass8BU.A0e(r0);
                return new C168978k4(C108965cb.A0H(r0), AnonymousClass3Ma.A0c(r0), A6Q3, A8r3, C108955ca.A0X(r0), A0e3, C108945cZ.A14(r0), str5, str6, str4, j2);
            case 3:
                C18030ve A8r4 = AnonymousClass10E.A8r(r0);
                AnonymousClass11W A0e4 = AnonymousClass8BU.A0e(r0);
                AnonymousClass181 A0H3 = C108965cb.A0H(r0);
                C18000vb A6Q4 = AnonymousClass10E.A6Q(r0);
                return new C172578te(A0H3, AnonymousClass3Ma.A0c(r0), A6Q4, A8r4, C108955ca.A0X(r0), A0e4, C108945cZ.A14(r0), str4, str5, str6, r0.Ais, r0.Ait, j2);
            case 4:
                C18030ve A8r5 = AnonymousClass10E.A8r(r0);
                AnonymousClass11W A0e5 = AnonymousClass8BU.A0e(r0);
                AnonymousClass181 A0H4 = C108965cb.A0H(r0);
                C18000vb A6Q5 = AnonymousClass10E.A6Q(r0);
                return A00(A0H4, AnonymousClass3Ma.A0c(r0), A6Q5, A8r5, C108955ca.A0X(r0), A0e5, C108945cZ.A14(r0), str4, str5, r0.Ais, r0.Ait, j2);
            case 5:
                C18030ve A8r6 = AnonymousClass10E.A8r(r0);
                AnonymousClass11W A0e6 = AnonymousClass8BU.A0e(r0);
                AnonymousClass181 A0H5 = C108965cb.A0H(r0);
                C18000vb A6Q6 = AnonymousClass10E.A6Q(r0);
                C19830z4 A0c2 = AnonymousClass3Ma.A0c(r0);
                AnonymousClass00H A14 = C108945cZ.A14(r0);
                C31611fq A0X = C108955ca.A0X(r0);
                C18070vi.A0w(A8r6, A0e6, A0H5, A6Q6, A0c2);
                C108965cb.A1P(A14, 6, str4);
                C18070vi.A0d(str5, 9);
                return new C172578te(A0H5, A0c2, A6Q6, A8r6, A0X, A0e6, A14, str4, str5, str6, C21517AlQ.A00(0), C21517AlQ.A00(1), j2);
            case 6:
                AnonymousClass11W A0e7 = AnonymousClass8BU.A0e(r0);
                AnonymousClass181 A0H6 = C108965cb.A0H(r0);
                C31611fq A0X2 = C108955ca.A0X(r0);
                C19830z4 A0c3 = AnonymousClass3Ma.A0c(r0);
                AnonymousClass00H A142 = C108945cZ.A14(r0);
                return new AnonymousClass8k2(A0H6, A0c3, AnonymousClass10E.A6Q(r0), AnonymousClass10E.A8r(r0), A0X2, A0e7, A142, str5, str6, str4, j2);
            case 7:
                C18030ve A8r7 = AnonymousClass10E.A8r(r0);
                AnonymousClass11W A0e8 = AnonymousClass8BU.A0e(r0);
                AnonymousClass181 A0H7 = C108965cb.A0H(r0);
                C31611fq A0X3 = C108955ca.A0X(r0);
                C18000vb A6Q7 = AnonymousClass10E.A6Q(r0);
                C19830z4 A0c4 = AnonymousClass3Ma.A0c(r0);
                AnonymousClass00H A143 = C108945cZ.A14(r0);
                C18070vi.A0w(A8r7, A0e8, A0H7, A0X3, A6Q7);
                C18070vi.A0l(A0c4, A143);
                C18070vi.A0d(str5, 9);
                return new C172578te(A0H7, A0c4, A6Q7, A8r7, A0X3, A0e8, A143, str4, str5, str6, C21517AlQ.A00(8), C21517AlQ.A00(9), j2);
            default:
                C18030ve A8r8 = AnonymousClass10E.A8r(r0);
                AnonymousClass11W A0e9 = AnonymousClass8BU.A0e(r0);
                AnonymousClass181 A0H8 = C108965cb.A0H(r0);
                C31611fq A0X4 = C108955ca.A0X(r0);
                C18000vb A6Q8 = AnonymousClass10E.A6Q(r0);
                C19830z4 A0c5 = AnonymousClass3Ma.A0c(r0);
                AnonymousClass00H A144 = C108945cZ.A14(r0);
                C18070vi.A0w(A8r8, A0e9, A0H8, A0X4, A6Q8);
                C18070vi.A0l(A0c5, A144);
                C18070vi.A0d(str5, 9);
                return new C172578te(A0H8, A0c5, A6Q8, A8r8, A0X4, A0e9, A144, str4, str5, str6, C21517AlQ.A00(22), C21517AlQ.A00(23), j2);
        }
    }
}
