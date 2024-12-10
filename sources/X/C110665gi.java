package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.views.VoipReturnToCallBanner;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5gi  reason: invalid class name and case insensitive filesystem */
public abstract class C110665gi extends RelativeLayout implements AnonymousClass3M7 {
    public C61182pG A00;
    public AnonymousClass1HQ A01;
    public AnonymousClass1HS A02;
    public C135166rl A03;
    public C1599286k A04;
    public AnonymousClass1M9 A05;
    public C24671Lf A06;
    public C24921Me A07;
    public AnonymousClass11C A08;
    public C18000vb A09;
    public C18030ve A0A;
    public AnonymousClass126 A0B;
    public AnonymousClass1BI A0C;
    public AnonymousClass1BI A0D;
    public C24901Mc A0E;
    public AnonymousClass1VT A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = false;
    public boolean A0M;
    public final Runnable A0N = new AnonymousClass7R9((Object) this, 8);
    public final C23581Gv A0O = new AnonymousClass7E0(this, 4);
    public final AnonymousClass1IV A0P = new AnonymousClass7OI(this, 0);

    public void A01() {
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        if (voipReturnToCallBanner.getContext() == null) {
            Log.w("voip/VoipReturnToCallBanner no context when call start");
            return;
        }
        WaImageView waImageView = voipReturnToCallBanner.A04;
        waImageView.setVisibility(0);
        int i = 2131231742;
        if (voipReturnToCallBanner.A0J) {
            i = 2131232399;
        }
        waImageView.setImageResource(i);
        Context context = voipReturnToCallBanner.getContext();
        int i2 = 2131898713;
        if (voipReturnToCallBanner.A0J) {
            i2 = 2131899576;
        }
        AnonymousClass3MY.A0w(context, waImageView, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r4 == null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r5 = this;
            r3 = r5
            com.whatsapp.calling.views.VoipReturnToCallBanner r3 = (com.whatsapp.calling.views.VoipReturnToCallBanner) r3
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "voip/VoipReturnToCallBanner no context when call start"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x000f:
            X.1BI r1 = r3.A0C
            if (r1 == 0) goto L_0x0047
            X.1BI r0 = r3.A0D
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
        L_0x001b:
            android.content.Context r1 = r3.getContext()
            r0 = 2131896775(0x7f1229c7, float:1.942842E38)
            java.lang.String r4 = r1.getString(r0)
            android.content.Context r2 = r3.getContext()
            boolean r1 = r3.A0J
            r0 = 2131886905(0x7f120339, float:1.9408402E38)
            if (r1 == 0) goto L_0x0034
            r0 = 2131886904(0x7f120338, float:1.94084E38)
        L_0x0034:
            java.lang.String r2 = r2.getString(r0)
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 2
            r1.setImportantForAccessibility(r0)
        L_0x003e:
            android.widget.TextView r0 = r3.A03
            r0.setText(r4)
            r0.setContentDescription(r2)
            return
        L_0x0047:
            X.1BI r0 = r3.A0C
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x005f
            boolean r0 = r3.A0L
            if (r0 != 0) goto L_0x001b
            java.lang.String r4 = r3.getTitleForContact()
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 1
        L_0x005a:
            r1.setImportantForAccessibility(r0)
            r2 = r4
            goto L_0x003e
        L_0x005f:
            boolean r0 = r3.A0L
            if (r0 != 0) goto L_0x0070
            java.lang.String r4 = r3.getTitleForGroup()
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 1
            r1.setImportantForAccessibility(r0)
            r2 = r4
            if (r4 != 0) goto L_0x003e
        L_0x0070:
            android.content.Context r2 = r3.getContext()
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x0083
            r1 = 2131898234(0x7f122f7a, float:1.943138E38)
        L_0x007b:
            java.lang.String r4 = r2.getString(r1)
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 2
            goto L_0x005a
        L_0x0083:
            boolean r0 = r3.A0J
            r1 = 2131887619(0x7f120603, float:1.940985E38)
            if (r0 == 0) goto L_0x007b
            r1 = 2131887618(0x7f120602, float:1.9409848E38)
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110665gi.A02():void");
    }

    public void A03() {
        AnonymousClass1BI A0T;
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        CallInfo callInfo = voipReturnToCallBanner.getCallInfo();
        if (callInfo != null) {
            if (callInfo.isAudioChat()) {
                voipReturnToCallBanner.setVisibility(8);
                return;
            }
            if (callInfo.isGroupCall) {
                A0T = callInfo.groupJid;
            } else {
                A0T = C108955ca.A0T(callInfo);
            }
            voipReturnToCallBanner.A0C = A0T;
            voipReturnToCallBanner.A0J = callInfo.videoEnabled;
            voipReturnToCallBanner.A02();
            voipReturnToCallBanner.A01();
        }
        voipReturnToCallBanner.A02.setVisibility(8);
    }

    public abstract void setCallNotificationTimer(long j);

    public void setTimerAccessibility(View view) {
        C108955ca.A1K(view, this, 4);
    }

    public static void A00(C110665gi r3, Collection collection) {
        AnonymousClass1BI r0 = r3.A0C;
        if (r0 != null && (r0 instanceof GroupJid)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI A0l = C72453Mb.A0l(it);
                if (A0l != null && A0l.equals(r3.A0C)) {
                    r3.A02();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if ((!X.C61182pG.A00(r2.A00)) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r2 = this;
            X.1HS r0 = r2.A02
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0013
            X.2pG r0 = r2.A00
            boolean r0 = X.C61182pG.A00(r0)
            r1 = r0 ^ 1
            r0 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0013:
            r0 = 8
        L_0x0015:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110665gi.A04():void");
    }

    public CallInfo getCallInfo() {
        Boolean bool = C17970vW.A03;
        return this.A01.BO3();
    }

    public String getTitleForContact() {
        AnonymousClass1E7 A0E2;
        AnonymousClass1BI r1 = this.A0C;
        if (r1 == null || (A0E2 = this.A05.A0E(r1)) == null) {
            return null;
        }
        return this.A07.A0I(A0E2);
    }

    public String getTitleForGroup() {
        GroupJid groupJid;
        AnonymousClass1BI r5 = this.A0C;
        if (r5 != null) {
            groupJid = (GroupJid) r5;
        } else {
            groupJid = null;
        }
        AnonymousClass1M9 r4 = this.A05;
        C24921Me r3 = this.A07;
        AnonymousClass1E7 A012 = C63982u1.A01(r4, this.A0B, groupJid, this.A0E, false);
        if (A012 != null) {
            return AnonymousClass3MY.A0q(r3, A012);
        }
        return null;
    }

    public void setBannerClickListener(Context context, View view) {
        C825248h.A00(view, this, context, 25);
    }

    public void setShouldHideBanner(boolean z) {
        this.A0M = z;
        A04();
    }

    public void setShouldHideCallDuration(boolean z) {
        this.A0K = z;
        A04();
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
        this.A0L = z;
        A02();
    }

    public void setVisibility(int i) {
        C1599286k r1;
        removeCallbacks(this.A0N);
        int visibility = getVisibility();
        if (this.A0M) {
            i = 8;
        }
        super.setVisibility(i);
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        int i2 = 8;
        voipReturnToCallBanner.A04.setVisibility(C72453Mb.A01(voipReturnToCallBanner.A0K ? 1 : 0));
        TextView textView = voipReturnToCallBanner.A02;
        if (!voipReturnToCallBanner.A0K && voipReturnToCallBanner.A0G) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (visibility != getVisibility() && (r1 = this.A04) != null) {
            r1.CAF(getVisibility());
        }
    }

    public C110665gi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getBackgroundColorRes() {
        return AnonymousClass1YL.A00(getContext(), 2130968925, 2131099980);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A06.registerObserver(this.A0O);
        C1599286k r1 = this.A04;
        if (r1 != null) {
            r1.CAF(getVisibility());
        }
        C135166rl r0 = this.A03;
        if (r0 != null) {
            boolean z = r0.A02;
            boolean z2 = r0.A01;
            boolean z3 = r0.A00;
            if (z) {
                setVisibility(8);
            } else {
                this.A0I = z2;
                this.A0H = z3;
                A03();
                this.A0N.run();
            }
        }
        this.A03 = null;
        this.A0F.registerObserver(this.A0P);
        A03();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0G = false;
        this.A0F.unregisterObserver(this.A0P);
        this.A06.unregisterObserver(this.A0O);
    }

    public void setCallLogData(C135166rl r1) {
        this.A03 = r1;
    }

    public void setContainerChatJid(AnonymousClass1BI r1) {
        this.A0D = r1;
    }

    public void setVisibilityChangeListener(C1599286k r1) {
        this.A04 = r1;
    }
}
