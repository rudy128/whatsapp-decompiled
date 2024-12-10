package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.7QS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QS implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Pair A03;
    public final /* synthetic */ AnonymousClass74M A04;
    public final /* synthetic */ File A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        File file;
        AnonymousClass74M r5 = this.A04;
        File file2 = this.A05;
        File file3 = this.A06;
        long j = this.A00;
        long j2 = this.A01;
        boolean z = this.A07;
        long j3 = this.A02;
        Pair pair = this.A03;
        AnonymousClass2LC r11 = r5.A18;
        Log.i("voicenote/voicenotestopped");
        AnonymousClass7KX.A00(r11, 37);
        if (j2 < 100 && j3 >= 1000) {
            C17900vP.A0l("voicenote/file too small; not previewing; voiceNoteFileLength=", AnonymousClass000.A10(), j2);
            AnonymousClass74M.A04(r5);
        }
        AnonymousClass70F r14 = r5.A0w;
        r14.A0O.setTranslationX(r14.A0C * ((float) C108975cc.A0m(AnonymousClass3MW.A1Z(r14.A0R) ? 1 : 0)));
        C160858Af r10 = r14.A04;
        if (r10 != null) {
            r10.C3Z();
        }
        if (r5.A0D != null) {
            AnonymousClass74M.A0I(r5, file3, 0, false);
        }
        AnonymousClass74M.A06(r5);
        if (z) {
            r5.A1G.A00 = false;
            if (r5.A1N) {
                AnonymousClass1FL r112 = r5.A0a;
                C18070vi.A0d(r112, 0);
                r112.setRequestedOrientation(-1);
            }
            r5.A0y.A00();
        }
        if (j3 < 1000 || j2 < 100) {
            AnonymousClass74M.A0C(r5);
            AnonymousClass74M.A0K(r5, false);
            AnonymousClass7RD.A00(r5.A12, file2, file3, 47);
            file = null;
            r5.A0K = null;
        } else {
            if (pair == null) {
                pair = r5.A13.A04(r5.A0C, r5.A0E, file2, file3);
            }
            File file4 = (File) pair.first;
            file = (File) pair.second;
            if (file4 != null) {
                AnonymousClass1BI r113 = r5.A0C;
                C17960vV.A07(r113);
                long A012 = AnonymousClass11P.A01(r5.A0n);
                long length = file2.length();
                String absolutePath = file4.getAbsolutePath();
                String name = file4.getName();
                AnonymousClass206 r3 = r5.A0E;
                C18070vi.A0f(r113, 0, name);
                C46212Dp r17 = new C46212Dp(C49472Qp.AUDIO, AnonymousClass25H.DRAFT, r113, (Long) null, (String) null, absolutePath, name, -1, (int) C17880vN.A04(j3), 0, A012, length);
                r17.A01 = r3;
                AnonymousClass74M.A0D(r5, 9);
                r5.A1B.BsH(r17);
            }
            C132526mx r102 = r5.A14;
            if (file4 != null && j >= 2) {
                String name2 = file4.getName();
                C18070vi.A0X(name2);
                r102.A02.CGF(new AnonymousClass7Pp(r102, C17880vN.A0w(AnonymousClass1YF.A0S(name2, new String[]{"@"}, 0), 0), 1, j));
            }
            r102.A00 = r5.A15.A01.isActivated();
            AnonymousClass7RD.A00(r5.A12, file2, file3, 47);
            AnonymousClass74M.A0C(r5);
            AnonymousClass70T r2 = r5.A0I;
            if (r2 != null && r2.A0C()) {
                r5.A0I.A09();
            }
            if (z && !r5.A0a.isFinishing()) {
                if (file4 != null) {
                    r5.A0W(file4, file, false, true);
                } else {
                    Log.e("voicenote/ error caching voice note for preview");
                    AnonymousClass74M.A0K(r5, false);
                }
            }
            r5.A0K = file4;
        }
        r5.A0L = file;
    }

    public /* synthetic */ AnonymousClass7QS(Pair pair, AnonymousClass74M r2, File file, File file2, long j, long j2, long j3, boolean z) {
        this.A04 = r2;
        this.A05 = file;
        this.A06 = file2;
        this.A00 = j;
        this.A01 = j2;
        this.A07 = z;
        this.A02 = j3;
        this.A03 = pair;
    }
}
