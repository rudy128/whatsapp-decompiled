package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.whatsapp.jid.Jid;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Px  reason: invalid class name and case insensitive filesystem */
public class C146607Px implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C146607Px(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj3;
    }

    public final void run() {
        Looper looper;
        String str;
        AnonymousClass205 r0;
        switch (this.A00) {
            case 0:
                C27451Wd r4 = (C27451Wd) this.A02;
                Object obj = this.A03;
                int i = this.A01;
                C30711eO r1 = new C30711eO();
                r1.A02 = C108955ca.A0x(obj);
                r1.A00 = Integer.valueOf(i);
                r1.A01 = r4.A01.A00();
                r4.A00.CC8(r1, (AnonymousClass1Be) this.A04);
                return;
            case 1:
                C62262r7 r12 = (C62262r7) this.A02;
                int i2 = this.A01;
                AnonymousClass206 r3 = (AnonymousClass206) this.A03;
                Long l = (Long) this.A04;
                C61652q2 r5 = (C61652q2) r12.A02.get();
                Boolean bool = null;
                Long l2 = null;
                Integer num = null;
                synchronized (r5) {
                    str = r5.A00;
                    if (str == null) {
                        str = C61652q2.A00(r5);
                    }
                }
                AnonymousClass1BI r42 = r3.A0v.A00;
                Integer valueOf = Integer.valueOf(((C63152sb) r5.A04.get()).A02(r42));
                C42941yz r02 = AnonymousClass1EC.A01;
                AnonymousClass1EC A002 = C42941yz.A00(r42);
                if (A002 != null) {
                    num = Integer.valueOf(AnonymousClass000.A1O(r5.A01.A01.A0K(A002) ? 1 : 0) ? 1 : 0);
                }
                Integer valueOf2 = Integer.valueOf(C62242r5.A00(r3, r5.A03));
                if (i2 == 40) {
                    l2 = l;
                    AnonymousClass22C A032 = C63892tr.A03(r3);
                    if (!(A032 == null || (r0 = A032.A0v) == null)) {
                        bool = Boolean.valueOf(r0.A02);
                    }
                }
                r12.A00.CC6(C181749Rr.A00(r5, bool, valueOf2, valueOf, num, l2, str, i2, 81), C62262r7.A03);
                return;
            case 2:
                int i3 = this.A01;
                C33721jH.A00(((C57342iv) this.A02).A01, (Boolean) this.A03, (Exception) this.A04, i3);
                return;
            case 3:
                AnonymousClass7CM r52 = (AnonymousClass7CM) this.A02;
                AnonymousClass206 r43 = (AnonymousClass206) this.A04;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("SplitThreadDetection/");
                String A0y = AnonymousClass000.A0y(((Jid) this.A03).getRawString(), A10);
                C26301Rp r2 = r52.A03;
                if (r2.A0O(A0y)) {
                    boolean z = r43.A0v.A02;
                    AnonymousClass624 r13 = new AnonymousClass624();
                    r13.A00 = Integer.valueOf(z ? 1 : 0);
                    r52.A01.CC7(r13);
                    C26301Rp.A04(r2, A0y, (String) null);
                    return;
                }
                return;
            case 4:
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A02;
                Collection collection = (Collection) this.A03;
                int i4 = this.A01;
                List list = (List) this.A04;
                if (statusPlaybackContactFragment.A1e() && !statusPlaybackContactFragment.A1D().isFinishing()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass206 A0Y = C17880vN.A0Y(it);
                        C002100z r14 = statusPlaybackContactFragment.A17;
                        AnonymousClass205 r03 = A0Y.A0v;
                        C18070vi.A0W(r03);
                        r14.A05(r03);
                    }
                    if (i4 >= list.size()) {
                        StatusPlaybackContactFragment.A0C(statusPlaybackContactFragment, 4, 6);
                        return;
                    }
                    StatusPlaybackContactFragment.A09(statusPlaybackContactFragment);
                    statusPlaybackContactFragment.A00 = -1;
                    StatusPlaybackContactFragment.A0A(statusPlaybackContactFragment, i4);
                    StatusPlaybackContactFragment.A0B(statusPlaybackContactFragment, StatusPlaybackContactFragment.A01(statusPlaybackContactFragment), 4, 6);
                    return;
                }
                return;
            case 5:
                C112195l5 r22 = (C112195l5) this.A02;
                C129226hS r53 = (C129226hS) this.A03;
                Object obj2 = this.A04;
                int i5 = this.A01;
                C18070vi.A0d(r53, 1);
                AnonymousClass1E7 A0H = r22.A02.A0H(r53.A02);
                String A0N = r22.A03.A0N(A0H);
                AnonymousClass1KB r04 = r22.A01;
                r04.A02.post(new AnonymousClass7QG(r22, A0H, obj2, r53, A0N, i5, 2));
                return;
            case 6:
                AnonymousClass6Gp r44 = (AnonymousClass6Gp) this.A02;
                int i6 = this.A01;
                AnonymousClass7FL r23 = (AnonymousClass7FL) this.A03;
                AnonymousClass206 r15 = (AnonymousClass206) this.A04;
                r44.A0Q();
                if (3 == i6) {
                    r44.A0K().A0D();
                    r44.A0V(r44.A0X());
                    if (!r23.A00) {
                        r44.A0O();
                        return;
                    }
                    return;
                } else if (i6 == 12) {
                    r44.A0K().A0D();
                    r44.A0V(r44.A0X());
                    if ((r15 instanceof C438421d) && AnonymousClass25A.A0z((AnonymousClass21V) r15)) {
                        if (!r23.A00) {
                            r44.A0O();
                        }
                        r23.A00 = true;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                C27231Vg r54 = (C27231Vg) this.A02;
                Context context = (Context) this.A03;
                Uri uri = (Uri) this.A04;
                int i7 = this.A01;
                try {
                    Boolean bool2 = r54.A03;
                    if (bool2 == null) {
                        bool2 = AnonymousClass3MZ.A15(r54.A05, 6832);
                        r54.A03 = bool2;
                    }
                    if (bool2.booleanValue()) {
                        looper = ((C25151Nc) r54.A02.get()).A00();
                    } else {
                        looper = null;
                    }
                    C121626Kw r16 = new C121626Kw(looper, i7);
                    r16.A01.setDataSource(context, uri);
                    r16.A05();
                    r16.A08();
                    AnonymousClass70T r05 = r54.A01;
                    if (r05 != null) {
                        r05.A06();
                    }
                    r54.A01 = r16;
                    return;
                } catch (Exception e) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("asyncaudioplayer/play/e Error playing URI: ");
                    A102.append(uri);
                    Log.w(AnonymousClass001.A1I(" with stream: ", A102, i7), e);
                    return;
                }
            default:
                int i8 = this.A01;
                C161078Bi.A00((Context) this.A03, (Intent) this.A04, (Class) this.A02, i8);
                return;
        }
    }
}
