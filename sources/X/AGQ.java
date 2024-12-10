package X;

import android.app.Notification;

public class AGQ implements B4F {
    public final int A00;
    public final Notification A01;
    public final String A02;
    public final String A03;

    public String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[");
        sb.append("packageName:");
        sb.append(this.A02);
        sb.append(", id:");
        sb.append(this.A00);
        sb.append(", tag:");
        sb.append(this.A03);
        return AnonymousClass000.A0z(sb);
    }

    public AGQ(Notification notification, String str, String str2, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = notification;
    }
}
