package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.22Q  reason: invalid class name */
public class AnonymousClass22Q extends C438421d {
    public int A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public BigDecimal A0B;
    public BigDecimal A0C;

    public AnonymousClass22Q(AnonymousClass205 r2, long j) {
        super(r2, 23, j);
    }

    public String A1G() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.A0A)) {
            sb.append(this.A0A);
        }
        if (!TextUtils.isEmpty(this.A02)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("\n");
            }
            sb.append(this.A02);
        }
        if (!TextUtils.isEmpty(this.A05)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("\n");
            }
            sb.append(this.A05);
        }
        return sb.toString();
    }
}
