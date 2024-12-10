package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import com.whatsapp.wamsys.JniBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.5vC  reason: invalid class name and case insensitive filesystem */
public class C115525vC extends A2k implements AnonymousClass87M {
    public final C18030ve A00;
    public final JniBridge A01;
    public final AnonymousClass181 A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass18K A04;
    public final C24371Kb A05;
    public final C24421Kg A06;

    public C115525vC(AnonymousClass1KB r11, AnonymousClass181 r12, BCQ bcq, AnonymousClass11P r14, C18030ve r15, AnonymousClass18K r16, C24371Kb r17, C24421Kg r18, AnonymousClass10I r19, JniBridge jniBridge, File file, String str, int i, long j) {
        super(r11, bcq, r19, file, str, i, j);
        this.A03 = r14;
        this.A00 = r15;
        this.A02 = r12;
        this.A04 = r16;
        this.A01 = jniBridge;
        this.A06 = r18;
        this.A05 = r17;
    }

    public /* synthetic */ void BsB(long j) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.89t, X.7Iv, java.lang.Object] */
    public Pair A01(C188219h4 r24) {
        C1602387r r1;
        Integer num;
        Integer num2;
        String str;
        Bitmap bitmap;
        byte[] byteArray;
        ByteArrayInputStream byteArrayInputStream;
        C188219h4 r8 = r24;
        String str2 = r8.A04;
        Uri parse = Uri.parse(str2);
        if (parse == null || !"static.whatsapp.net".equals(parse.getAuthority())) {
            r1 = new C696037v(str2, "image");
        } else {
            r1 = new C696137w(str2);
        }
        ? obj = new Object();
        C129086hE r5 = new C129086hE(obj, r1, (String) null, false);
        AnonymousClass11P r12 = this.A03;
        AnonymousClass181 r10 = this.A02;
        C24421Kg r3 = this.A06;
        C24371Kb r2 = this.A05;
        AnonymousClass70W r13 = r8.A00;
        ConcurrentMap concurrentMap = r8.A05;
        Iterator A0l = C17890vO.A0l(concurrentMap);
        while (true) {
            if (!A0l.hasNext()) {
                num = null;
                break;
            }
            BCx bCx = (BCx) A0l.next();
            if (bCx != null) {
                num = bCx.BVo();
                break;
            }
        }
        Iterator A0l2 = C17890vO.A0l(concurrentMap);
        while (true) {
            if (A0l2.hasNext()) {
                if (A0l2.next() != null) {
                    num2 = C17880vN.A0h();
                    break;
                }
            } else {
                num2 = null;
                break;
            }
        }
        String str3 = "";
        if (num != null) {
            str = C25291Nq.A02(num.intValue());
        } else {
            str = str3;
        }
        if (num2 != null) {
            str3 = C25291Nq.A01(num2.intValue());
        }
        C18030ve r14 = this.A00;
        JniBridge jniBridge = this.A01;
        C26551So r9 = r8.A00.A0m;
        C17960vV.A07(r9);
        String str4 = r9.A02;
        int A0G = C72453Mb.A0G(r14, jniBridge, 1);
        C58092k8 r132 = new C58092k8(r14, jniBridge, (Integer) null, str, str4, str3, (String) null, false);
        C1409173o r32 = new C147067Rr(r10, r12, r2, r13, r5, this, r3, r132).BJE().A00;
        AnonymousClass64W r22 = r32.A00;
        if (r22 != null) {
            Iterator A0l3 = C17890vO.A0l(concurrentMap);
            while (true) {
                if (!A0l3.hasNext()) {
                    break;
                }
                Integer BVo = ((BCx) A0l3.next()).BVo();
                r22.A0K = BVo;
                if (BVo != null) {
                    C26551So r0 = r8.A00.A0m;
                    C17960vV.A07(r0);
                    r22.A0M = Integer.valueOf(C1409973w.A01(r0.A00, BVo.intValue(), false));
                    r22.A0J = Integer.valueOf(A0G);
                    boolean A032 = r32.A03();
                    AnonymousClass18K r02 = this.A04;
                    if (A032) {
                        r02.CC7(r22);
                    } else {
                        C108965cb.A1E(r22, r02);
                    }
                }
            }
        }
        if (r32.A03()) {
            ByteArrayOutputStream byteArrayOutputStream = obj.A00;
            if (byteArrayOutputStream == null) {
                byteArray = null;
            } else {
                byteArray = byteArrayOutputStream.toByteArray();
            }
            C17960vV.A07(byteArray);
            String A042 = C17970vW.A04(r8.A03);
            C17960vV.A07(A042);
            try {
                byteArrayInputStream = new ByteArrayInputStream(byteArray);
                this.A03.A04(byteArrayInputStream, A042);
                byteArrayInputStream.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
            bitmap = this.A03.A02(A042, r8.A02, r8.A01, false);
        } else {
            bitmap = null;
        }
        return C108945cZ.A0N(true, bitmap);
        throw th;
    }
}
