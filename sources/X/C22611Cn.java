package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1Cn  reason: invalid class name and case insensitive filesystem */
public class C22611Cn {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass196 A02;

    public void A01() {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore-manager/finish/db-is-ready ");
            AnonymousClass1Cd r1 = this.A00;
            r1.A06();
            sb.append(r1.A08);
            Log.i(sb.toString());
            r1.A06();
            if (!r1.A08) {
                Log.w("msgstore-manager/finish/db is not ready yet", new Throwable());
            } else {
                r1.A07 = true;
            }
        }
    }

    public C192039nf A00() {
        C192039nf r1;
        AnonymousClass1Cd r3 = this.A00;
        r3.A06();
        ReentrantReadWriteLock.WriteLock writeLock = r3.A04;
        writeLock.lock();
        try {
            Log.i("msgstore-manager/initialize");
            synchronized (r3) {
                if (!r3.A08) {
                    AnonymousClass1Cd.A01(r3);
                    AnonymousClass1Cd.A02(r3);
                    r1 = new C192039nf(2);
                } else {
                    r1 = new C192039nf(0);
                }
            }
            writeLock.unlock();
            return r1;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public void A02() {
        AnonymousClass1Cd r0 = this.A00;
        r0.A06();
        AnonymousClass1Cd.A01(r0);
    }

    public void A03() {
        AnonymousClass1Cd r0 = this.A00;
        r0.A06();
        r0.A02.A03 = true;
        A02();
        try {
            Context context = this.A01.A00;
            Intent intent = new Intent(context, Class.forName("com.whatsapp.Main"));
            intent.setFlags(268468224);
            context.startActivity(intent);
            this.A02.A04("MessageStoreLifecycleManager");
        } catch (ClassNotFoundException e) {
            Log.e((Throwable) e);
        }
    }

    public C22611Cn(AnonymousClass118 r1, AnonymousClass196 r2, AnonymousClass1Cd r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }
}
