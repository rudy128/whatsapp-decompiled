package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.4jp  reason: invalid class name and case insensitive filesystem */
public final class C93964jp implements C108235bM {
    public final Activity A00;
    public final AnonymousClass1L9 A01;
    public final AnonymousClass1LU A02;
    public final AnonymousClass1EC A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93964jp) {
                C93964jp r5 = (C93964jp) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4DG BNs() {
        return AnonymousClass4DG.DESTRUCTIVE;
    }

    public void CBU() {
        AnonymousClass1L9 r5 = this.A01;
        Activity activity = this.A00;
        AnonymousClass1EC r3 = this.A03;
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(activity.getPackageName(), "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity");
        AnonymousClass3MY.A12(A0A, r3, "parent_group_jid");
        r5.A08(activity, A0A);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A02))));
    }

    public C93964jp(Activity activity, AnonymousClass1L9 r2, AnonymousClass1LU r3, AnonymousClass1EC r4) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = r2;
        this.A03 = r4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeactivateButton(waIntents=");
        A10.append(this.A02);
        A10.append(", activity=");
        A10.append(this.A00);
        A10.append(", activityUtils=");
        A10.append(this.A01);
        A10.append(", parentGroupJid=");
        return AnonymousClass001.A1F(this.A03, A10);
    }

    public int BQk() {
        return 2131888604;
    }
}
