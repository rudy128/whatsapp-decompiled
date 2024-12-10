package X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.5jY  reason: invalid class name and case insensitive filesystem */
public class C111335jY extends C22702BLf {
    public C42621yT A00;
    public Cursor A01;
    public final C34141jz A02;
    public final C1602787v A03;
    public final AnonymousClass1Ez A04 = new AnonymousClass1Ez("ModifiedMessagesLoader");
    public final AnonymousClass18K A05;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.1yT] */
    public /* bridge */ /* synthetic */ Object A06() {
        Cursor BUo;
        AnonymousClass1Ez r1 = this.A04;
        r1.A04();
        synchronized (this) {
            if (!AnonymousClass000.A1W(this.A01)) {
                this.A00 = new Object();
            } else {
                throw new AnonymousClass1QC();
            }
        }
        try {
            r1.A04();
            BUo = this.A03.BUo(this.A00, this.A02);
            if (BUo != null) {
                BUo.getCount();
            }
            synchronized (this) {
                this.A00 = null;
            }
            return BUo;
        } catch (RuntimeException e) {
            BUo.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A00 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    public void A07() {
        synchronized (this) {
            C42621yT r0 = this.A00;
            if (r0 != null) {
                r0.A01();
            }
            AnonymousClass1Ez r1 = this.A04;
            r1.A03("canceled");
            r1.A02();
        }
    }

    public void A02() {
        Cursor cursor = this.A01;
        if (cursor != null) {
            A04(cursor);
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A01 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: A0C */
    public void A04(Cursor cursor) {
        if (this.A05) {
            if (cursor != null) {
                cursor.close();
            }
            AnonymousClass1Ez r1 = this.A04;
            r1.A03("canceled");
            r1.A02();
            return;
        }
        Cursor cursor2 = this.A01;
        this.A01 = cursor;
        if (this.A06) {
            super.A04(cursor);
        }
        if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
            cursor2.close();
        }
        AnonymousClass1Ez r0 = this.A04;
        long A012 = r0.A01();
        r0.A02();
        C22681Cu r12 = new C22681Cu();
        r12.A00 = Long.valueOf(A012);
        r12.A02 = "ModifiedMessagesLoader";
        this.A05.CC7(r12);
    }

    public C111335jY(Context context, AnonymousClass18K r4, C34141jz r5, C1602787v r6) {
        super(context);
        this.A05 = r4;
        this.A03 = r6;
        this.A02 = r5;
    }

    public void A01() {
        A00();
        Cursor cursor = this.A01;
        if (cursor != null && !cursor.isClosed()) {
            this.A01.close();
        }
        this.A01 = null;
    }

    public void A03() {
        A00();
    }
}
