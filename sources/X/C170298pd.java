package X;

import android.os.Parcelable;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.8pd  reason: invalid class name and case insensitive filesystem */
public final class C170298pd extends AnonymousClass8pG {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public String A04;

    public String A04() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void A07(List list) {
        C18070vi.A0d(list, 1);
        String str = this.A04;
        if (str != null) {
            AnonymousClass8BT.A1S("psp_transaction_id", str, list);
        }
        String str2 = this.A03;
        if (str2 != null) {
            AnonymousClass8BT.A1S("psp_receipt_url", str2, list);
        }
    }

    public void A05(AnonymousClass1KI r3, C29621ca r4, int i) {
        if (r4 != null) {
            String A0Q = r4.A0Q("psp_transaction_id", (String) null);
            if (A0Q != null) {
                this.A04 = A0Q;
            }
            String A0Q2 = r4.A0Q("psp_receipt_url", (String) null);
            if (A0Q2 != null) {
                this.A03 = A0Q2;
            }
        }
    }

    public void A06(String str) {
        super.A06(str);
        JSONObject A16 = C17880vN.A16(str);
        this.A04 = A16.optString("pspTransactionId", this.A04);
        this.A03 = A16.optString("pspReceiptURL", this.A03);
    }

    public void A0R(AnonymousClass8pG r2) {
        super.A0R(r2);
        C170298pd r22 = (C170298pd) r2;
        String str = r22.A04;
        if (str != null) {
            this.A04 = str;
        }
        String str2 = r22.A03;
        if (str2 != null) {
            this.A03 = str2;
        }
    }
}
