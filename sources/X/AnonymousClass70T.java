package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.70T  reason: invalid class name */
public abstract class AnonymousClass70T {
    public static AnonymousClass70T A00(AnonymousClass118 r7, C18030ve r8, AnonymousClass6gC r9, File file, int i) {
        boolean z;
        C18030ve r3 = r8;
        if (r8 != null) {
            z = A01(r8);
        } else {
            z = false;
        }
        File file2 = file;
        int i2 = i;
        if (r7 != null && z && file.getAbsolutePath().endsWith(".opus")) {
            return new C121616Kv(r7.A00, r3, r9, file2, i2);
        }
        if (!file.getAbsolutePath().endsWith(".opus")) {
            C121626Kw r2 = new C121626Kw((Looper) null, i);
            r2.A01.setDataSource(file.getAbsolutePath());
            return r2;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioPlayer/create exoplayer enabled:");
        A10.append(z);
        A10.append(" Build.MANUFACTURER:");
        A10.append(Build.MANUFACTURER);
        A10.append(" Build.DEVICE:");
        A10.append(Build.DEVICE);
        A10.append(" SDK_INT:");
        A10.append(Build.VERSION.SDK_INT);
        C17890vO.A0w(A10);
        return new C121606Ku(file, i);
    }

    public static boolean A01(C18030ve r3) {
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r3, 751) || C108985cd.A1V(r3) || C39761tb.A0E(C18020vd.A01(r2, r3, 5589))) {
            return false;
        }
        return true;
    }

    public int A02() {
        long j;
        if (this instanceof C121606Ku) {
            try {
                j = ((C121606Ku) this).A01.getCurrentPosition();
            } catch (IOException e) {
                Log.e((Throwable) e);
                return 0;
            }
        } else if (!(this instanceof C121616Kv)) {
            return ((C121626Kw) this).A01.getCurrentPosition();
        } else {
            j = ((C121616Kv) this).A07.A09();
        }
        return (int) j;
    }

    public int A03() {
        if (this instanceof C121606Ku) {
            try {
                return (int) ((C121606Ku) this).A01.getLength();
            } catch (IOException e) {
                Log.e((Throwable) e);
                return 0;
            }
        } else if (this instanceof C121616Kv) {
            return ((C121616Kv) this).A00;
        } else {
            return ((C121626Kw) this).A01.getDuration();
        }
    }

    public void A04() {
        if (this instanceof C121606Ku) {
            try {
                ((C121606Ku) this).A01.pause();
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
        } else if (this instanceof C121616Kv) {
            C121616Kv r1 = (C121616Kv) this;
            r1.A06 = false;
            r1.A07.A0B();
        } else {
            ((C121626Kw) this).A01.pause();
        }
    }

    public void A05() {
        if (this instanceof C121606Ku) {
            ((C121606Ku) this).A01.prepare();
        } else if (this instanceof C121616Kv) {
            ((C121616Kv) this).A07.A0F(1.0f);
        } else {
            ((C121626Kw) this).A01.prepare();
        }
    }

    public void A06() {
        if (this instanceof C121606Ku) {
            ((C121606Ku) this).A01.close();
        } else if (this instanceof C121616Kv) {
            C121616Kv r1 = (C121616Kv) this;
            r1.A02 = null;
            r1.A05 = false;
            r1.A06 = false;
            r1.A07.A0D();
        } else {
            C121626Kw r12 = (C121626Kw) this;
            r12.A02.postDelayed(new AnonymousClass7RJ(r12, 2), 100);
        }
    }

    public void A07() {
        if (this instanceof C121606Ku) {
            ((C121606Ku) this).A01.resume();
        } else if (this instanceof C121616Kv) {
            ((C121616Kv) this).A07.A0C();
        } else {
            ((C121626Kw) this).A01.start();
        }
    }

    public void A08() {
        if (this instanceof C121606Ku) {
            ((C121606Ku) this).A01.start();
        } else if (this instanceof C121616Kv) {
            C121616Kv r1 = (C121616Kv) this;
            r1.A06 = true;
            r1.A07.A0C();
        } else {
            ((C121626Kw) this).A01.start();
        }
    }

    public void A09() {
        AnonymousClass88K r0;
        if (this instanceof C121606Ku) {
            C121606Ku r1 = (C121606Ku) this;
            try {
                r1.A01.stop();
                AnonymousClass88K r02 = r1.A00;
                if (r02 != null) {
                    r02.C6z();
                }
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
        } else {
            if (this instanceof C121616Kv) {
                C121616Kv r3 = (C121616Kv) this;
                r3.A06 = false;
                C26378Cye cye = r3.A07;
                C26378Cye.A06(cye, "stop", new Object[0]);
                Handler handler = cye.A0C;
                handler.sendMessage(handler.obtainMessage(37));
                r0 = r3.A03;
            } else {
                C121626Kw r12 = (C121626Kw) this;
                r12.A01.stop();
                r0 = r12.A00;
            }
            if (r0 != null) {
                r0.C6z();
            }
        }
    }

    public void A0A(int i) {
        if (this instanceof C121606Ku) {
            ((C121606Ku) this).A01.seek((long) i);
        } else if (this instanceof C121616Kv) {
            C109005cf.A0U(((C121616Kv) this).A07, Integer.valueOf(i), new Object[2], i);
        } else {
            ((C121626Kw) this).A01.seekTo(i);
        }
    }

    public void A0B(AnonymousClass88K r2) {
        if (this instanceof C121606Ku) {
            ((C121606Ku) this).A00 = r2;
        } else if (this instanceof C121616Kv) {
            ((C121616Kv) this).A03 = r2;
        } else {
            ((C121626Kw) this).A00 = r2;
        }
    }

    public boolean A0C() {
        if (this instanceof C121606Ku) {
            try {
                return ((C121606Ku) this).A01.isPlaying();
            } catch (IOException e) {
                Log.e((Throwable) e);
                return false;
            }
        } else if (!(this instanceof C121616Kv)) {
            return ((C121626Kw) this).A01.isPlaying();
        } else {
            C121616Kv r0 = (C121616Kv) this;
            C26378Cye cye = r0.A07;
            if (cye == null) {
                return false;
            }
            if (r0.A06 || cye.A0J()) {
                return true;
            }
            return false;
        }
    }

    public boolean A0D(AnonymousClass190 r6, float f) {
        if (this instanceof C121606Ku) {
            return false;
        }
        C121616Kv r0 = (C121616Kv) this;
        r0.A01 = r6;
        try {
            C26378Cye cye = r0.A07;
            if (C108945cZ.A00(cye.A0L, f) < 0.1f) {
                return true;
            }
            C26378Cye.A06(cye, "setPlaybackSpeed", new Object[0]);
            C108955ca.A1F(cye.A0C, Float.valueOf(f), 26);
            return true;
        } catch (IllegalArgumentException | IllegalStateException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("currSpeed: ");
            A10.append(-1.0f);
            A10.append(" , newSpeed: ");
            A10.append(f);
            r6.A0G("heroaudioplayer/setPlaybackSpeed failed", A10.toString(), true);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("heroaudioplayer/setPlaybackSpeed failed, currSpeed: ");
            A102.append(-1.0f);
            A102.append(" , newSpeed: ");
            A102.append(f);
            C17890vO.A0w(A102);
            return false;
        }
    }
}
