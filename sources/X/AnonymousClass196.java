package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.facebook.common.hiddenapis2.ApiExemption;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/* renamed from: X.196  reason: invalid class name */
public class AnonymousClass196 implements AnonymousClass191 {
    public final AnonymousClass195 A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass194 A02;
    public final AnonymousClass18O A03;
    public final AnonymousClass11C A04;
    public final C18030ve A05;
    public final C17930vS A06;
    public final C18010vc A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass118 A0A;
    public final C19830z4 A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public volatile AnonymousClass193 A0E;

    public /* synthetic */ void Blg() {
    }

    public File A00() {
        File file = new File(this.A06.A01(), "crash_in_video_sentinel");
        if (!file.createNewFile()) {
            StringBuilder sb = new StringBuilder();
            sb.append("mediatranscodequeue/failed-to-create/");
            sb.append(file.getAbsolutePath());
            Log.w(sb.toString());
        }
        return file;
    }

    public void A01() {
        File file = new File(this.A06.A01(), "crash_in_video_sentinel");
        if (file.exists() && !file.delete()) {
            Log.w("crashlogs/failed-delete-crash-sentinel-file");
        }
    }

    public void A02() {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        AnonymousClass18O r7 = this.A03;
        if (r7.A09(AnonymousClass18O.A0I)) {
            File file = new File(this.A06.A01(), "crash_counter");
            int[] iArr = new int[2];
            try {
                if (!file.exists()) {
                    file.createNewFile();
                } else {
                    try {
                        objectInputStream = new ObjectInputStream(new FileInputStream(file));
                        String[] split = ((String) objectInputStream.readObject()).split(",");
                        for (int i = 0; i < split.length; i++) {
                            iArr[i] = Integer.parseInt(split[i]);
                        }
                        objectInputStream.close();
                    } catch (Exception e) {
                        Log.e("Unable to read from crash counter file", e);
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                    }
                }
                if (this.A00.A00) {
                    iArr[0] = iArr[0] + 1;
                } else {
                    iArr[1] = iArr[1] + 1;
                }
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                StringBuilder sb = new StringBuilder();
                sb.append(iArr[0]);
                sb.append(",");
                sb.append(iArr[1]);
                objectOutputStream.writeObject(sb.toString());
                objectOutputStream.close();
                File A012 = C18010vc.A01(this.A07.A00);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ab-props-backup");
                sb2.append(".xml");
                if (new File(A012, sb2.toString()).exists()) {
                    if (iArr[0] >= r7.A04(AnonymousClass18O.A0q)) {
                        AnonymousClass190 r8 = this.A01;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Crashes count foreground: ");
                        sb3.append(iArr[0]);
                        sb3.append(" Crashes count background: ");
                        sb3.append(iArr[1]);
                        r8.A0G("ForegroundAppCrashLoop", sb3.toString(), false);
                    } else if (iArr[1] >= r7.A04(AnonymousClass18O.A0p)) {
                        AnonymousClass190 r82 = this.A01;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Crashes count foreground: ");
                        sb4.append(iArr[0]);
                        sb4.append(" Crashes count background: ");
                        sb4.append(iArr[1]);
                        r82.A0G("BackgroundAppCrashLoop", sb4.toString(), false);
                    }
                }
            } catch (Exception e2) {
                Log.e("Unable to use crash counter file", e2);
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            if (r7.A09(AnonymousClass18O.A0H)) {
                Context context = this.A07.A00;
                File A013 = C18010vc.A01(context);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("ab-props-backup");
                sb5.append(".xml");
                if (!new File(A013, sb5.toString()).exists()) {
                    return;
                }
                if (iArr[0] >= r7.A04(AnonymousClass18O.A0q) || iArr[1] >= r7.A04(AnonymousClass18O.A0p)) {
                    File A014 = C18010vc.A01(context);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("ab-props-backup");
                    sb6.append(".xml");
                    File file2 = new File(A014, sb6.toString());
                    File A015 = C18010vc.A01(context);
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("ab-props");
                    sb7.append(".xml");
                    File file3 = new File(A015, sb7.toString());
                    if (file2.exists()) {
                        file2.renameTo(file3);
                    }
                    AnonymousClass190 r2 = this.A01;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Crashes count foreground:");
                    sb8.append(iArr[0]);
                    sb8.append(" Crashes count background: ");
                    sb8.append(iArr[1]);
                    r2.A0G("RevertToPreviousStableABPropsCopy", sb8.toString(), false);
                    return;
                }
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public void A04(String str) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.A0B.A00.get()).edit();
        edit.putString("crash_state_manager:system_exit", str);
        if (!edit.commit()) {
            Log.w("reportSystemExit/failed-to-save-preferences");
        }
        System.exit(0);
    }

    public void Blf() {
        C18030ve r2 = this.A05;
        C18040vf r8 = C18040vf.A02;
        if (C18020vd.A05(r8, r2, 10932)) {
            C50102Td r5 = C63052sQ.A02;
            C50092Tc r4 = C680231t.A03;
            AnonymousClass118 r1 = this.A0A;
            C18070vi.A0d(r1, 0);
            C680231t r3 = C680231t.A04;
            if (r3 == null) {
                synchronized (r4) {
                    r3 = C680231t.A04;
                    if (r3 == null) {
                        Context context = r1.A00;
                        C18070vi.A0X(context);
                        r3 = new C680231t(context, r2);
                        C680231t.A04 = r3;
                    }
                }
            }
            C63052sQ r12 = C63052sQ.A03;
            if (r12 == null) {
                synchronized (r5) {
                    r12 = C63052sQ.A03;
                    if (r12 == null) {
                        r12 = new C63052sQ(r3);
                        C63052sQ.A03 = r12;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ASAP");
            sb.append("_start");
            C63052sQ.A00(sb.toString());
            C63052sQ.A00("ReflectionConfig_init");
            C28472E2n e2n = r12.A00;
            C680231t r42 = (C680231t) e2n;
            Context context2 = r42.A01;
            synchronized (C24897COq.class) {
                if (C24897COq.A02 == null) {
                    C24897COq.A02 = new C24897COq(context2);
                }
            }
            if (C18020vd.A05(r8, r42.A02, 10934)) {
                boolean z = false;
                if (C24897COq.A02 != null) {
                    z = true;
                }
                C17960vV.A0H(z, "Call FixieReflectionConfig.init() first");
                ApiExemption.enableUnsafeExemption();
            }
            C63052sQ.A00("ReflectionConfig_end");
            Iterator it = AnonymousClass1ZU.A06(new C23861BrI(e2n), new DP9(e2n)).iterator();
            while (it.hasNext()) {
                C72263Lg r13 = (C72263Lg) it.next();
                if (r13 != null) {
                    try {
                        String name = r13.getName();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(name);
                        sb2.append("_start");
                        C63052sQ.A00(sb2.toString());
                        r13.Bd6();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(name);
                        sb3.append("_end");
                        C63052sQ.A00(sb3.toString());
                    } catch (Throwable th) {
                        Log.w("Fixie exception in FixieInitializer", th);
                    }
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ASAP");
            sb4.append("_end");
            C63052sQ.A00(sb4.toString());
        }
        if (C18020vd.A05(C18040vf.A01, r2, 7997)) {
            C61332pV r32 = (C61332pV) this.A0D.get();
            C180539My.A03 = SystemClock.uptimeMillis();
            C180539My.A06 = true;
            C185279cK r0 = C185279cK.A02;
            if (r0 == null) {
                r0 = new C185279cK();
                C185279cK.A02 = r0;
            }
            r0.A00.post(new C21466AkX((Object) r32, 43));
            C30221da.A02 = (C30221da) r32.A01.get();
        }
        this.A0C.CGv(new C70573Bq(this, 11), 10000);
    }

    public AnonymousClass196(AnonymousClass195 r1, AnonymousClass190 r2, AnonymousClass194 r3, AnonymousClass18O r4, AnonymousClass11C r5, AnonymousClass118 r6, C19830z4 r7, C18030ve r8, C17930vS r9, C18010vc r10, AnonymousClass10I r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        this.A05 = r8;
        this.A0C = r11;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A0B = r7;
        this.A08 = r12;
        this.A09 = r13;
        this.A07 = r10;
        this.A00 = r1;
        this.A06 = r9;
        this.A0A = r6;
        this.A0D = r14;
    }

    public void A03(AnonymousClass193 r1) {
        this.A0E = r1;
    }

    public void Ba9() {
    }
}
