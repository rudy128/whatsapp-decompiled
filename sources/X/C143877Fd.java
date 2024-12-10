package X;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7Fd  reason: invalid class name and case insensitive filesystem */
public abstract class C143877Fd implements C201511a {
    public C438921i A00;
    public final int A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass118 A03;
    public final C27301Vn A04;
    public final AnonymousClass121 A05;
    public final C24681Lg A06;
    public final Integer A07;
    public final C218617r A08;
    public final C24921Me A09;
    public final AnonymousClass1NM A0A;
    public final AnonymousClass11P A0B;
    public final AnonymousClass11Z A0C;
    public final C18030ve A0D;
    public final AnonymousClass18K A0E;
    public final AnonymousClass12N A0F;
    public final C36181nT A0G;
    public final C32431hB A0H;
    public final AnonymousClass10I A0I;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public long A03() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.C120676Ev
            if (r0 == 0) goto L_0x0014
            r0 = r3
            X.6Ev r0 = (X.C120676Ev) r0
            monitor-enter(r2)
            X.2dM r0 = r0.A09     // Catch:{ all -> 0x003b }
            android.content.SharedPreferences r1 = r0.A00     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "wamo_gdpr_report_expiration_timestamp"
            long r0 = X.C17890vO.A05(r1, r0)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0014:
            boolean r0 = r3 instanceof X.C120666Eu
            if (r0 == 0) goto L_0x0029
            r0 = r3
            X.6Eu r0 = (X.C120666Eu) r0
            monitor-enter(r2)
            X.0z4 r0 = r0.A01     // Catch:{ all -> 0x003b }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "newsletter_gdpr_report_expiration_timestamp"
            long r0 = X.C17890vO.A05(r1, r0)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0029:
            r0 = r3
            X.6Et r0 = (X.C120656Et) r0
            monitor-enter(r2)
            X.0z4 r0 = r0.A01     // Catch:{ all -> 0x003b }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "gdpr_report_expiration_timestamp"
            long r0 = X.C17890vO.A05(r1, r0)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r2)
            return r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143877Fd.A03():long");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public long A04() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.C120676Ev
            if (r0 == 0) goto L_0x0014
            r0 = r3
            X.6Ev r0 = (X.C120676Ev) r0
            monitor-enter(r2)
            X.2dM r0 = r0.A09     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r1 = r0.A00     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "wamo_gdpr_report_timestamp"
            long r0 = X.C17890vO.A04(r1, r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0031
        L_0x0014:
            boolean r0 = r3 instanceof X.C120666Eu
            if (r0 == 0) goto L_0x0025
            r0 = r3
            X.6Eu r0 = (X.C120666Eu) r0
            monitor-enter(r2)
            X.0z4 r1 = r0.A01     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "newsletter_gdpr_report_timestamp"
            long r0 = r1.A0W(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0031
        L_0x0025:
            r0 = r3
            X.6Et r0 = (X.C120656Et) r0
            monitor-enter(r2)
            X.0z4 r1 = r0.A01     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "gdpr_report_timestamp"
            long r0 = r1.A0W(r0)     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r2)
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143877Fd.A04():long");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.lang.Integer A07() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.C120676Ev
            if (r0 == 0) goto L_0x0018
            r0 = r3
            X.6Ev r0 = (X.C120676Ev) r0
            monitor-enter(r2)
            X.2dM r0 = r0.A09     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences r1 = r0.A00     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "wamo_gdpr_report_state"
            int r0 = X.C17890vO.A00(r1, r0)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r0 = X.AnonymousClass6XM.A00(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0018:
            boolean r0 = r3 instanceof X.C120666Eu
            if (r0 == 0) goto L_0x0031
            r0 = r3
            X.6Eu r0 = (X.C120666Eu) r0
            monitor-enter(r2)
            X.0z4 r0 = r0.A01     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "newsletter_gdpr_report_state"
            int r0 = X.C17890vO.A00(r1, r0)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r0 = X.AnonymousClass6XM.A00(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0031:
            r0 = r3
            X.6Et r0 = (X.C120656Et) r0
            monitor-enter(r2)
            X.0z4 r0 = r0.A01     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "gdpr_report_state"
            int r0 = X.C17890vO.A00(r1, r0)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r0 = X.AnonymousClass6XM.A00(r0)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r2)
            return r0
        L_0x0047:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143877Fd.A07():java.lang.Integer");
    }

    public synchronized void A0A() {
        Log.i("gdpr/on-report-deleted");
        A0B();
    }

    public final synchronized void A0B() {
        Log.i("gdpr/reset");
        this.A00 = null;
        File A062 = A06();
        if (A062.exists() && !A062.delete()) {
            Log.e("gdpr/reset/failed-delete-report-info");
        }
        C64062u9.A0H(this.A08.A0F(), 0);
        A09();
    }

    public final synchronized void A0C() {
        boolean z;
        File A0e;
        A07();
        A07();
        Integer num = AnonymousClass00R.A0Y;
        if (AnonymousClass6XN.A00(A07()) == 3) {
            if (this instanceof C120676Ev) {
                A0e = C17880vN.A0e(((C120676Ev) this).A01.A01.A00.getFilesDir(), "wamo_gdpr.zip");
            } else if (this instanceof C120666Eu) {
                A0e = C17880vN.A0e(((C120666Eu) this).A00.A01.A00.getFilesDir(), "channels_gdpr.zip");
            } else {
                A0e = C17880vN.A0e(((C120656Et) this).A00.A01.A00.getFilesDir(), "gdpr.zip");
            }
            if (!A0e.exists()) {
                Log.e("gdpr/validate-state/report-media-file-missing");
                A0D(2);
            }
        }
        Integer A072 = A07();
        Integer num2 = AnonymousClass00R.A0C;
        if (A072 == num2) {
            if (this instanceof C120676Ev) {
                z = AnonymousClass000.A1W(C120676Ev.A00((C120676Ev) this));
            } else {
                z = AnonymousClass000.A1W(A05());
            }
            if (!z) {
                Log.e("gdpr/validate-state/report-message-missing");
                A09();
            }
        }
        if (A07() == num2 || A07() == num) {
            AnonymousClass11P r5 = this.A0B;
            if (AnonymousClass11P.A01(r5) > A03()) {
                long A012 = AnonymousClass11P.A01(r5);
                long A032 = A03();
                if (A012 > A032) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("gdpr/validate-state/report-too-old current:");
                    A10.append(A012);
                    C17900vP.A0m(" expired:", A10, A032);
                    A09();
                }
            }
        }
    }

    public final synchronized void A0F(long j) {
        Log.i("gdpr/on-report-requested");
        A0D(1);
        A0E(j);
    }

    public synchronized void A0H(byte[] bArr, long j, long j2) {
        boolean z = this instanceof C120676Ev;
        synchronized (this) {
            if (!z) {
                Log.i("gdpr/on-report-available");
                try {
                    C17970vW.A0A(A06(), bArr);
                    this.A00 = A01(bArr);
                    if (A05() == null) {
                        Log.e("gdpr/on-report-available/cannot-create-message");
                    } else {
                        A0D(2);
                        A0E(j);
                        if (this instanceof C120666Eu) {
                            C17880vN.A1D(C19830z4.A00(((C120666Eu) this).A01), "newsletter_gdpr_report_expiration_timestamp", j2);
                        } else {
                            C17880vN.A1D(C19830z4.A00(((C120656Et) this).A01), "gdpr_report_expiration_timestamp", j2);
                        }
                    }
                } catch (IOException e) {
                    Log.e("gdpr/on-report-available/cannot-save", e);
                }
            }
        }
        return;
    }

    private final C438921i A01(byte[] bArr) {
        C438921i r1;
        String str;
        try {
            C166418cr A012 = C166418cr.A01(bArr);
            if (A012 != null) {
                AnonymousClass206 A002 = this.A0F.A00(C196699vU.A00(A012, new AnonymousClass205(AnonymousClass688.A00, "", false), 0).A00());
                C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageDocument");
                r1 = (C438921i) A002;
                try {
                    if (this instanceof C120676Ev) {
                        str = "wamo_gdpr.zip";
                    } else if (this instanceof C120666Eu) {
                        str = "channels_gdpr.zip";
                    } else {
                        str = "gdpr.zip";
                    }
                    r1.A09 = str;
                    return r1;
                } catch (AnonymousClass1PN | C32711hd e) {
                    e = e;
                    Log.e("gdpr/create-gdpr-message", e);
                    return r1;
                }
            } else {
                Log.e("gdpr/create-gdpr-message/null");
                return null;
            }
        } catch (AnonymousClass1PN | C32711hd e2) {
            e = e2;
            r1 = null;
            Log.e("gdpr/create-gdpr-message", e);
            return r1;
        }
    }

    public long A02() {
        if (this instanceof C120676Ev) {
            C136466tr A002 = C120676Ev.A00((C120676Ev) this);
            if (A002 != null) {
                return A002.A00;
            }
            return 0;
        }
        C438921i A052 = A05();
        if (A052 != null) {
            return A052.A01;
        }
        return 0;
    }

    public final C438921i A05() {
        byte[] A0K;
        if (this.A00 != null || (A0K = C17970vW.A0K(A06())) == null) {
            return this.A00;
        }
        return A01(A0K);
    }

    public File A06() {
        if (this instanceof C120676Ev) {
            return C17880vN.A0e(this.A03.A00.getFilesDir(), "wamo_gdpr.info");
        }
        boolean z = this instanceof C120666Eu;
        File filesDir = this.A03.A00.getFilesDir();
        if (z) {
            return C17880vN.A0e(filesDir, "channels_gdpr.info");
        }
        return C17880vN.A0e(filesDir, "gdpr.info");
    }

    public void A08() {
        int i;
        if (this instanceof C120676Ev) {
            i = 2131898446;
        } else if (this instanceof C120666Eu) {
            i = 2131892638;
        } else {
            i = 2131890641;
        }
        Log.i("gdpr/notify-report-available");
        AnonymousClass118 r5 = this.A03;
        Context A0E2 = C108945cZ.A0E(r5);
        String A0F2 = C18070vi.A0F(A0E2, i);
        C1409673t A032 = C217217d.A03(A0E2);
        A032.A0M = "other_notifications@1";
        A032.A0F(A0F2);
        A032.A09(System.currentTimeMillis());
        A032.A06(3);
        A032.A0G(true);
        A032.A0E(r5.A01(2131899103));
        A032.A0D(A0F2);
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(A0E2.getPackageName(), "com.whatsapp.report.ReportActivity");
        A032.A0A = C1408573i.A00(A0E2, 0, A0A2, 0);
        C17880vN.A1G(A032);
        C27301Vn r2 = this.A04;
        Notification A052 = A032.A05();
        C18070vi.A0X(A052);
        r2.BkR(16, A052);
    }

    public void A09() {
        if (this instanceof C120676Ev) {
            C120676Ev r1 = (C120676Ev) this;
            r1.A00 = false;
            C17880vN.A1B(r1.A09.A00.edit().remove("wamo_gdpr_report_expiration_timestamp").remove("wamo_gdpr_report_timestamp"), "wamo_gdpr_report_state");
        } else if (this instanceof C120666Eu) {
            C17880vN.A1B(C19830z4.A00(((C120666Eu) this).A01).remove("newsletter_gdpr_report_expiration_timestamp").remove("newsletter_gdpr_report_timestamp"), "newsletter_gdpr_report_state");
        } else {
            C17880vN.A1B(C19830z4.A00(((C120656Et) this).A01).remove("gdpr_report_expiration_timestamp").remove("gdpr_report_timestamp"), "gdpr_report_state");
        }
    }

    public void A0D(int i) {
        if (this instanceof C120676Ev) {
            C17880vN.A1C(((C120676Ev) this).A09.A00.edit(), "wamo_gdpr_report_state", i);
        } else if (this instanceof C120666Eu) {
            C17880vN.A1C(C19830z4.A00(((C120666Eu) this).A01), "newsletter_gdpr_report_state", i);
        } else {
            C17880vN.A1C(C19830z4.A00(((C120656Et) this).A01), "gdpr_report_state", i);
        }
    }

    public void A0E(long j) {
        C19830z4 r1;
        String str;
        if (this instanceof C120676Ev) {
            C17880vN.A1D(((C120676Ev) this).A09.A00.edit(), "wamo_gdpr_report_timestamp", j);
            return;
        }
        if (this instanceof C120666Eu) {
            r1 = ((C120666Eu) this).A01;
            str = "newsletter_gdpr_report_timestamp";
        } else {
            r1 = ((C120656Et) this).A01;
            str = "gdpr_report_timestamp";
        }
        r1.A1q(str, j);
    }

    public synchronized void A0G(Activity activity) {
        int i;
        boolean z = this instanceof C120676Ev;
        synchronized (this) {
            if (!z) {
                Log.i("gdpr/download-report");
                C438921i A052 = A05();
                if (A052 != null) {
                    C62572rc A0M = AnonymousClass3Ma.A0M(A052);
                    AnonymousClass1KB r8 = this.A02;
                    AnonymousClass18K r7 = this.A0E;
                    AnonymousClass11Z r4 = this.A0C;
                    AnonymousClass68N r9 = new AnonymousClass68N(activity, r8, this.A09, this.A0A, r4, r7, this, this.A0I);
                    if (C18020vd.A05(C18040vf.A02, this.A0D, 555)) {
                        C36181nT r82 = this.A0G;
                        C26551So A022 = C63972u0.A02(A052);
                        String A19 = A052.A19();
                        String str = A052.A05;
                        C17960vV.A07(str);
                        String str2 = A052.A08;
                        String str3 = A052.A07;
                        String str4 = A0M.A0J;
                        C17960vV.A07(str4);
                        byte[] bArr = A0M.A0a;
                        long j = A052.A01;
                        if (this instanceof C120666Eu) {
                            i = 5;
                        } else {
                            i = 1;
                        }
                        r82.A0A(r9, A022, new C145937Ne(A052, this, 26), new C145937Ne(A052, this, 27), A19, str, str2, str3, str4, (String) null, bArr, i, 8, 6, 0, j);
                    } else {
                        this.A0H.A0D(r9, A052, 0);
                    }
                } else {
                    Log.e("gdpr/download/no-message");
                }
            }
        }
    }

    public C143877Fd(C218617r r3, AnonymousClass1KB r4, C24921Me r5, AnonymousClass1NM r6, AnonymousClass11P r7, AnonymousClass118 r8, C27301Vn r9, AnonymousClass11Z r10, AnonymousClass121 r11, C24681Lg r12, C18030ve r13, AnonymousClass18K r14, AnonymousClass12N r15, C36181nT r16, C32431hB r17, AnonymousClass10I r18, Integer num) {
        this.A03 = r8;
        this.A0B = r7;
        this.A0D = r13;
        this.A02 = r4;
        this.A0I = r18;
        this.A08 = r3;
        this.A0E = r14;
        this.A0C = r10;
        this.A09 = r5;
        this.A05 = r11;
        this.A06 = r12;
        this.A0A = r6;
        this.A0G = r16;
        this.A0H = r17;
        this.A04 = r9;
        this.A0F = r15;
        this.A07 = num;
        this.A01 = C18020vd.A00(C18040vf.A02, r13, 4866);
    }
}
