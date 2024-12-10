package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0RL  reason: invalid class name */
public final class AnonymousClass0RL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(12);
    public final int A00;
    public final int A01;
    public final Intent A02;
    public final IntentSender A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0RL(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r0)
            X.C18070vi.A0b(r3)
            android.content.IntentSender r3 = (android.content.IntentSender) r3
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r5.readParcelable(r0)
            android.content.Intent r2 = (android.content.Intent) r2
            int r1 = r5.readInt()
            int r0 = r5.readInt()
            r4.<init>(r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RL.<init>(android.os.Parcel):void");
    }

    public AnonymousClass0RL(Intent intent, IntentSender intentSender, int i, int i2) {
        C18070vi.A0d(intentSender, 1);
        this.A03 = intentSender;
        this.A02 = intent;
        this.A00 = i;
        this.A01 = i2;
    }
}
