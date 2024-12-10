package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7R6  reason: invalid class name */
public class AnonymousClass7R6 implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public AnonymousClass7R6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A07 = str;
        this.A05 = obj4;
        this.A06 = obj5;
    }

    public final void run() {
        List list;
        List list2;
        C146347Ot r12;
        Context context;
        int i;
        C140116zy r4;
        String str;
        int i2;
        String str2;
        String str3;
        AnonymousClass1KB A0a;
        Runnable r1;
        switch (this.A00) {
            case 0:
                AnonymousClass126 r0 = (AnonymousClass126) this.A02;
                AnonymousClass1EB r8 = (AnonymousClass1EB) this.A03;
                AnonymousClass206 r6 = (AnonymousClass206) this.A04;
                int i3 = this.A01;
                String str4 = this.A07;
                SystemClock.sleep(300);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("group/create again, jid:");
                A10.append(r8);
                A10.append(" subject:");
                C17890vO.A1B(A10, r6.A0P());
                C18070vi.A0d(r8, 1);
                C188679ho r62 = new C188679ho((GroupJid) null, r8, r6.A0P(), str4, r6.A0T(), i3, false, false, true, false, true, false, true, false);
                AnonymousClass11P r122 = r0.A0F;
                AnonymousClass2JJ r11 = new AnonymousClass2JJ(r122, r0.A0J, r0.A0K, r0, r0, r62, r8, r0.A0h, (File) this.A05, (File) this.A06, str4);
                C18030ve r5 = r0.A0U;
                AnonymousClass190 r14 = r0.A03;
                AnonymousClass11S r42 = r0.A05;
                AnonymousClass1OZ A0U = C17880vN.A0U(r0.A14);
                new C20988Acg(r14, r42, r0.A09, r122, r0.A0T, r5, r0, r11, r11.A00, A0U).A00();
                return;
            case 1:
                AnonymousClass73N r52 = (AnonymousClass73N) this.A02;
                Long l = (Long) this.A03;
                String str5 = this.A07;
                Context context2 = (Context) this.A04;
                int i4 = this.A01;
                WeakReference weakReference = (WeakReference) this.A05;
                Number number = (Number) this.A06;
                C18070vi.A0d(weakReference, 5);
                try {
                    if (((AnonymousClass11E) r52.A09.get()).A09()) {
                        r52.A03 = l;
                        if (r52.A02 == null || !C18070vi.A18(str5, r52.A04)) {
                            r52.A07 = true;
                            C108945cZ.A0a(r52.A0A).A0J(new C146757Qm(r52, 21));
                            if (r52.A08) {
                                r52.A01 = -1;
                            }
                            C121626Kw r02 = r52.A02;
                            if (r02 != null) {
                                r02.A06();
                            }
                            Uri parse = Uri.parse(str5);
                            C121626Kw r2 = new C121626Kw(((C25151Nc) r52.A0B.get()).A00(), 3);
                            MediaPlayer mediaPlayer = r2.A01;
                            mediaPlayer.setDataSource(context2, parse);
                            mediaPlayer.setOnPreparedListener(new AnonymousClass75V(r52, weakReference));
                            r2.A05();
                            r2.A0A(i4);
                            r2.A00 = new AnonymousClass7N4(r52, weakReference);
                            r52.A02 = r2;
                            r52.A00 = i4;
                            r52.A04 = str5;
                        }
                        r52.A06 = weakReference;
                        C121626Kw r3 = r52.A02;
                        if (r3 != null) {
                            if (r3.A01.isPlaying()) {
                                r3.A04();
                                AnonymousClass73N.A00(r52);
                            } else {
                                r52.A07 = false;
                                if (r52.A00 != i4) {
                                    r52.A00 = i4;
                                    r3.A0A(i4);
                                }
                                if (number != null) {
                                    r3.A0A(number.intValue());
                                }
                                r3.A08();
                                AnonymousClass73N.A01(r52);
                            }
                            A0a = C108945cZ.A0a(r52.A0A);
                            r1 = new C21433Ak0(weakReference, r3, 45);
                        } else {
                            return;
                        }
                    } else {
                        A0a = C108945cZ.A0a(r52.A0A);
                        r1 = new C146757Qm(r52, 22);
                    }
                    A0a.A0J(r1);
                    return;
                } catch (IOException e) {
                    e = e;
                    str3 = "MusicPlayer/togglePlayback/IOException";
                    Log.e(str3, e);
                    return;
                } catch (IllegalStateException e2) {
                    e = e2;
                    str3 = "MusicPlayer/togglePlayback/IllegalStateException";
                    Log.e(str3, e);
                    return;
                }
            case 2:
                context = (Context) this.A03;
                i2 = this.A01;
                list = (List) this.A04;
                str2 = this.A07;
                Object obj = this.A05;
                C134426qZ r82 = (C134426qZ) this.A06;
                C18070vi.A0d(context, 1);
                C72473Md.A1M(list, str2, obj, 3);
                r4 = (C140116zy) ((C41801x5) this.A02).A07.get();
                list2 = C18070vi.A0M(obj);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("CrosspostRequestSessionManager/handleNewStatusEligibilityRequest called for session: ");
                A102.append(str2);
                A102.append(" with message ");
                ArrayList A0D = C29351c6.A0D(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C108995ce.A1Q(A0D, it);
                }
                String A0V = C17890vO.A0V(A0D, A102);
                i = 0;
                C18070vi.A0d(A0V, 0);
                if (!AnonymousClass74A.A07(list)) {
                    ((C133526ou) r4.A07.get()).A00(str2);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((AnonymousClass73E) r4.A08.get()).A05(str2, list2, 1, C17880vN.A0Y(it2).A0x);
                    }
                    r12 = new C146347Ot(r82, str2, list, i2);
                    str = "CrosspostRequestSessionManager/handleNewStatusEligibilityRequest start text status burning and eligibility";
                    break;
                } else {
                    C18070vi.A0d("CrosspostRequestSessionManager/handleNewStatusEligibilityRequest skip for audio status", 0);
                    r82.A01(AnonymousClass6OM.A00, AnonymousClass00R.A00, str2, list, i2);
                    return;
                }
            default:
                C41801x5 r10 = (C41801x5) this.A02;
                list2 = (List) this.A03;
                list = (List) this.A04;
                context = (Context) this.A05;
                C1603788f r112 = (C1603788f) this.A06;
                i2 = 1;
                C18070vi.A0k(list2, list);
                C18070vi.A0d(r112, 6);
                C41801x5.A02(r10, list2, list, 1);
                r4 = (C140116zy) r10.A07.get();
                str2 = AnonymousClass74A.A01();
                AnonymousClass6OE r83 = new AnonymousClass6OE(context, r10, r112, r10.A06, list2, list);
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("CrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest called for session: ");
                A103.append(str2);
                A103.append(" with message ");
                ArrayList A0E = C29351c6.A0E(list);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C108995ce.A1Q(A0E, it3);
                }
                String A0V2 = C17890vO.A0V(A0E, A103);
                i = 0;
                C18070vi.A0d(A0V2, 0);
                if (!AnonymousClass74A.A07(list)) {
                    ((C133526ou) r4.A07.get()).A00(str2);
                    ArrayList A0E2 = C29351c6.A0E(list);
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        C108995ce.A1Q(A0E2, it4);
                    }
                    AnonymousClass74A.A05(r4.A00, (AnonymousClass2LF) C18070vi.A0E(r4.A03), r4.A08, str2, A0E2, list2);
                    r12 = new C146347Ot(r83, str2, list, 1);
                    str = "CrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest start text status re-burning and eligibility";
                    break;
                } else {
                    C18070vi.A0d("CrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest skip for audio status", 0);
                    r83.A01(AnonymousClass6OM.A00, AnonymousClass00R.A00, str2, list, 1);
                    return;
                }
        }
        C18070vi.A0d(str, i);
        C18070vi.A0d("CrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest started", i);
        ArrayList A032 = AnonymousClass74A.A03((AnonymousClass73E) C18070vi.A0E(r4.A08), list, list2);
        ArrayList<AnonymousClass210> A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof AnonymousClass210) {
                A13.add(next);
            }
        }
        if (!A13.isEmpty()) {
            AnonymousClass00H r63 = r4.A06;
            C133766pS r53 = (C133766pS) r63.get();
            for (AnonymousClass210 A002 : A13) {
                r53.A00(context, A002);
            }
            C133766pS r54 = (C133766pS) r63.get();
            for (AnonymousClass210 A012 : A13) {
                r54.A01(A012);
            }
        }
        ((C133106oB) r4.A02.get()).A00(r12, str2, list, A032, list2, i2);
    }

    public AnonymousClass7R6(Context context, C41801x5 r4, C1603788f r5, List list, List list2) {
        this.A00 = 3;
        this.A02 = r4;
        this.A01 = 1;
        this.A03 = list;
        this.A04 = list2;
        this.A05 = context;
        this.A07 = "status_fragment";
        this.A06 = r5;
    }
}
