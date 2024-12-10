package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.49R  reason: invalid class name */
public class AnonymousClass49R extends A34 {
    public int A00;
    public AnonymousClass4PG A01;
    public final AnonymousClass126 A02;
    public final AnonymousClass12M A03;
    public final AnonymousClass1OZ A04;
    public final String A05;
    public final WeakReference A06;
    public final AnonymousClass11P A07;

    public AnonymousClass49R(AcceptInviteLinkActivity acceptInviteLinkActivity, AnonymousClass11P r3, AnonymousClass126 r4, AnonymousClass12M r5, AnonymousClass1OZ r6, String str) {
        super(acceptInviteLinkActivity, true);
        this.A07 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = AnonymousClass3MW.A0z(acceptInviteLinkActivity);
        this.A05 = str;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        try {
            this.A04.A0E(32000);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.A03.A06(new C96414no(this, 0), this.A05).get(32000, TimeUnit.MILLISECONDS);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < 500) {
                    SystemClock.sleep(500 - elapsedRealtime2);
                    return null;
                }
            } catch (Exception e) {
                Log.w("acceptlink/failed/timeout", e);
            }
        } catch (C36811oV unused) {
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        boolean z;
        Drawable r0;
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A06.get();
        if (acceptInviteLinkActivity != null) {
            String str = this.A05;
            AnonymousClass4PG r4 = this.A01;
            int i = this.A00;
            if (r4 != null) {
                int i2 = r4.A02;
                boolean z2 = true;
                if (i2 == 1) {
                    View A0A = C110885hR.A0A(acceptInviteLinkActivity, 2131431281);
                    ThumbnailButton thumbnailButton = (ThumbnailButton) C110885hR.A0A(acceptInviteLinkActivity, 2131431280);
                    AnonymousClass1VU r13 = acceptInviteLinkActivity.A09;
                    ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass1YH.A00(acceptInviteLinkActivity.getTheme(), acceptInviteLinkActivity.getResources(), AnonymousClass1YL.A00(acceptInviteLinkActivity, 2130970830, 2131102245)));
                    C65482wZ r3 = new C65482wZ(0);
                    if (C18020vd.A05(C18040vf.A02, r13.A00, 1257)) {
                        r0 = new AnonymousClass26q(colorDrawable, r3);
                    } else {
                        r0 = new C43031z8(colorDrawable, r3);
                    }
                    A0A.setBackground(r0);
                    thumbnailButton.A05 = new C65482wZ(0);
                } else {
                    z2 = false;
                }
                AnonymousClass1CJ r02 = acceptInviteLinkActivity.A04;
                AnonymousClass1EC r32 = r4.A05;
                if (!r02.A0P(r32) || !acceptInviteLinkActivity.A06.A0J(r32)) {
                    boolean Bed = acceptInviteLinkActivity.Bed();
                    StringBuilder A10 = AnonymousClass000.A10();
                    if (!Bed) {
                        C17900vP.A0Y(r32, "acceptlink/processcode/showconfirmation/", A10);
                        z = false;
                    } else {
                        C17900vP.A0Y(r32, "acceptlink/processcode/activityended/", A10);
                        return;
                    }
                } else {
                    C17900vP.A0Y(r32, "acceptlink/processcode/exists/", AnonymousClass000.A10());
                    AnonymousClass1KB r1 = acceptInviteLinkActivity.A05;
                    int i3 = 2131886178;
                    if (z2) {
                        i3 = 2131886179;
                    }
                    z = true;
                    r1.A08(i3, 1);
                }
                acceptInviteLinkActivity.A0D.A01(r4, 0);
                C58422kf r12 = new C58422kf(new C96484nv(acceptInviteLinkActivity), C17880vN.A0U(acceptInviteLinkActivity.A0J));
                C18070vi.A0d(str, 0);
                r12.A01((GroupJid) null, str, (String) null);
                TextView A0I = AnonymousClass3MW.A0I(acceptInviteLinkActivity, 2131431788);
                int i4 = 2131891020;
                if (!z) {
                    i4 = 2131891518;
                    if (i2 == 1) {
                        i4 = 2131891522;
                    }
                }
                A0I.setText(i4);
                A0I.setOnClickListener(new C89734cw(acceptInviteLinkActivity, r4, str, z));
                AcceptInviteLinkActivity.A03(acceptInviteLinkActivity);
                return;
            }
            C17900vP.A0i("acceptlink/processcode/failed/", AnonymousClass000.A10(), i);
            int i5 = 2131892439;
            if (i != 0) {
                i5 = 2131890297;
                if (i != 401) {
                    i5 = 2131890301;
                    if (i != 404) {
                        i5 = 2131890299;
                        if (i != 406) {
                            i5 = 2131890303;
                            if (i != 410) {
                                i5 = 2131890294;
                                if (i != 419) {
                                    i5 = 2131895032;
                                    if (i == 436) {
                                        AcceptInviteLinkActivity.A0Q(acceptInviteLinkActivity, 2131891483);
                                        C72463Mc.A18(acceptInviteLinkActivity, 2131431961);
                                        acceptInviteLinkActivity.findViewById(2131431961).setOnClickListener(new C825348i(acceptInviteLinkActivity));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            AcceptInviteLinkActivity.A0Q(acceptInviteLinkActivity, i5);
        }
    }
}
