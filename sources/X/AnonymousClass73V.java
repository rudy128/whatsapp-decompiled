package X;

import android.content.Intent;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.73V  reason: invalid class name */
public final class AnonymousClass73V {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02 = C217517g.A00(49542);
    public final AtomicBoolean A03 = C108965cb.A0w();
    public final AtomicLong A04 = new AtomicLong(0);
    public final AnonymousClass11S A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final C18140vp A09;
    public final C18140vp A0A;
    public final C18140vp A0B;

    public final void A04(AnonymousClass1FU r5, String str, String str2) {
        String str3;
        C18070vi.A0d(r5, 0);
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 7755)) {
            this.A08.get();
            boolean A052 = C18020vd.A05(r1, r2, 9979);
            Intent A0A2 = C17880vN.A0A();
            if (A052) {
                str3 = "com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity";
            } else {
                str3 = "com.whatsapp.avatar.editor.AvatarEditorLauncherActivity";
            }
            A0A2.setClassName(r5.getPackageName(), str3);
            A0A2.putExtra("origin", str);
            if (str2 != null) {
                A0A2.putExtra("deeplink", str2);
            }
            A0A2.addFlags(335544320);
            r5.startActivity(A0A2);
            return;
        }
        A05(str, str2, AnonymousClass3MW.A0z(r5));
    }

    public static final Exception A01(AnonymousClass6U4 r1) {
        if (r1.equals(AnonymousClass6N7.A00)) {
            return AnonymousClass000.A0n("Activity no longer active");
        }
        if (r1 instanceof AnonymousClass6N5) {
            return ((AnonymousClass6N5) r1).A00.A02;
        }
        if (r1.equals(AnonymousClass6N8.A00)) {
            return null;
        }
        if (r1 instanceof AnonymousClass6N6) {
            return ((AnonymousClass6N6) r1).A00;
        }
        throw AnonymousClass3MW.A14();
    }

    public static final void A03(AnonymousClass73V r15, C136936ue r16, AnonymousClass70I r17, String str, WeakReference weakReference, int i, boolean z) {
        WeakReference weakReference2 = weakReference;
        AnonymousClass1FU A002 = A00(weakReference2);
        AnonymousClass73V r11 = r15;
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            r15.A03.set(false);
            return;
        }
        WeakReference A0z = AnonymousClass3MW.A0z(A002);
        boolean A0B2 = C28281Zt.A0B(A002);
        String A0j = C108985cd.A0j(r15.A05);
        ((C133096oA) r15.A06.get()).A00(new AnonymousClass7OP(r11, r16, r17, weakReference2, i, z), C124436Yi.A00, "com.bloks.www.avatar.editor.cds.launcher.async", A0j, str, A0z, A0B2);
    }

    public final void A05(String str, String str2, WeakReference weakReference) {
        String str3;
        AtomicBoolean atomicBoolean = this.A03;
        if (atomicBoolean.get() || AnonymousClass11P.A01(this.A00) - this.A04.get() <= 500) {
            str3 = "Avatar Editor is already launching.";
        } else {
            WeakReference weakReference2 = weakReference;
            AnonymousClass1FU A002 = A00(weakReference2);
            if (A002 == null) {
                str3 = "Unable to obtain Activity reference.";
            } else {
                atomicBoolean.set(true);
                C136936ue r13 = (C136936ue) this.A0A.get();
                C133856pc r3 = (C133856pc) this.A0B.get();
                C27021Uk r7 = (C27021Uk) this.A09.get();
                A002.CNB(0, 2131886842);
                AnonymousClass70I A0q = C108945cZ.A0q(this.A07);
                int A012 = A0q.A01();
                A0q.A03(A012, "launch_editor");
                A0q.A06(AnonymousClass6EH.A00, str, A012);
                HashMap A11 = C17880vN.A11();
                String str4 = r13.A01;
                if (str4 == null) {
                    str4 = C17890vO.A0Q();
                    r13.A01 = str4;
                }
                C18070vi.A0b(str4);
                C18070vi.A0d(str4, 1);
                A11.put("logging_session_id", str4);
                A11.put("logging_surface", "wa_settings");
                A11.put("logging_mechanism", "wa_settings_item");
                String str5 = str2;
                if (str2 != null) {
                    A11.put("deeplink", str5);
                }
                String A003 = AnonymousClass6XH.A00(A11);
                A0q.A03(A012, "editor_params_ready");
                boolean A013 = r7.A01();
                r13.A05((Integer) null, (String) null, 1, A013);
                if (r3.A00() == null) {
                    A0q.A03(A012, "create_user");
                    A0q.A00 = Integer.valueOf(A012);
                    r3.A01.CGN(new C21433Ak0(r3, new AnonymousClass7LC(this, r13, A0q, A003, weakReference2, A012, A013), 40));
                    return;
                }
                A03(this, r13, A0q, A003, weakReference2, A012, A013);
                return;
            }
        }
        Log.e(str3);
    }

    public AnonymousClass73V(AnonymousClass11S r4, AnonymousClass11P r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, C18140vp r10, C18140vp r11, C18140vp r12) {
        C18070vi.A0w(r5, r6, r4, r10, r7);
        C18070vi.A0q(r11, r8, r12);
        C18070vi.A0d(r9, 9);
        this.A00 = r5;
        this.A01 = r6;
        this.A05 = r4;
        this.A0A = r10;
        this.A06 = r7;
        this.A0B = r11;
        this.A07 = r8;
        this.A09 = r12;
        this.A08 = r9;
    }

    public static final AnonymousClass1FU A00(WeakReference weakReference) {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(weakReference);
        if (A0Z != null) {
            AnonymousClass1FU r3 = null;
            if (!A0Z.isDestroyed()) {
                r3 = A0Z;
            }
            if (!A0Z.isFinishing()) {
                return r3;
            }
        }
        return null;
    }

    public static final void A02(AnonymousClass1FU r10, AnonymousClass73V r11, AnonymousClass6U4 r12) {
        int i;
        AnonymousClass1FU r3 = r10;
        if (A01(r12) instanceof IOException) {
            Log.e("AvatarEditorLauncher/unable to launch editor, network/io exception identified", A01(r12));
            if (C18020vd.A05(C18040vf.A02, r11.A01, 7755)) {
                i = 2131886841;
            } else {
                r10.BhU(new Object[0], 0, 2131886841);
                Log.e("AvatarEditorLauncher/unable to load avatar", A01(r12));
            }
        } else {
            i = 2131886840;
            if (!C18020vd.A05(C18040vf.A02, r11.A01, 7755)) {
                r10.BhQ(2131886840);
                Log.e("AvatarEditorLauncher/unable to load avatar", A01(r12));
            }
        }
        r3.CMx((Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, "launcher_error_dialog_tag", (String) null, (Object[]) null);
        Log.e("AvatarEditorLauncher/unable to load avatar", A01(r12));
    }
}
