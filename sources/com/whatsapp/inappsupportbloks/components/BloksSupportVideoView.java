package com.whatsapp.inappsupportbloks.components;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1SL;
import X.AnonymousClass3C8;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass7C8;
import X.C000200d;
import X.C107045Ye;
import X.C132976nx;
import X.C146487Ph;
import X.C17890vO;
import X.C18070vi;
import X.C42491yG;
import X.C72453Mb;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.Formatter;
import java.util.Locale;

public final class BloksSupportVideoView extends ConstraintLayout implements AnonymousClass009 {
    public int A00;
    public AnonymousClass1KB A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public C107045Ye A05;
    public AnonymousClass11E A06;
    public AnonymousClass10I A07;
    public AnonymousClass00H A08;
    public AnonymousClass031 A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A07();
        this.A05 = new AnonymousClass7C8(this);
        A00();
    }

    public static final void setVideoThumbnail$lambda$4$lambda$3(BloksSupportVideoView bloksSupportVideoView, Bitmap bitmap) {
        C18070vi.A0d(bloksSupportVideoView, 0);
        WaImageView waImageView = bloksSupportVideoView.A03;
        if (waImageView == null) {
            C18070vi.A11("videoThumbnail");
            throw null;
        } else {
            waImageView.setImageBitmap(bitmap);
        }
    }

    public final void A08(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        long j;
        C18070vi.A0d(str, 0);
        if (str2 != null) {
            int A002 = AnonymousClass1SL.A00(getConnectivityStateProvider().A04());
            if (A002 == 2 || A002 == 3 || A002 == 4) {
                Log.i("BloksSupportVideoView/getVideoUrlByNetworkType: use hdVideoUrl");
            } else {
                Log.i("BloksSupportVideoView/getVideoUrlByNetworkType: use sdVideoUrl");
                str = str2;
            }
        }
        this.A0D = str;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
        if (num != null) {
            j = (long) num.intValue();
        } else {
            j = 1000;
        }
        setVideoInformation(j);
        C132976nx r1 = (C132976nx) getSupportVideoLogger().get();
        r1.A01 = C17890vO.A0Q();
        r1.A02 = str6;
        r1.A04 = str7;
        r1.A03 = str5;
        r1.A00 = str4;
    }

    public final void setConnectivityStateProvider(AnonymousClass11E r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setSupportVideoLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r5 == null) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r6, long r7) {
        /*
            java.lang.String r4 = r6.A0D
            if (r4 != 0) goto L_0x000b
            java.lang.String r0 = "videoUrl"
            X.C18070vi.A11(r0)
            r0 = 0
        L_0x000a:
            throw r0
        L_0x000b:
            r5 = 0
            r2 = 0
            java.lang.String r0 = "BloksSupportVideoView/retrieveVideoDuration"
            X.5dc r1 = new X.5dc     // Catch:{ Exception -> 0x002f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x002f }
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ Exception -> 0x002f }
            r1.setDataSource(r4, r0)     // Catch:{ Exception -> 0x002f }
            r0 = 9
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r0 == 0) goto L_0x0041
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            goto L_0x0041
        L_0x0029:
            r0 = move-exception
            r5 = r1
            goto L_0x003d
        L_0x002c:
            r4 = move-exception
            r5 = r1
            goto L_0x0030
        L_0x002f:
            r4 = move-exception
        L_0x0030:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "BloksSupportVideoView/retrieveVideoDuration: "
            X.C108995ce.A1M(r0, r1, r4)     // Catch:{ all -> 0x003a }
            goto L_0x0045
        L_0x003a:
            r0 = move-exception
            if (r5 == 0) goto L_0x000a
        L_0x003d:
            r5.release()
            throw r0
        L_0x0041:
            r1.release()
            goto L_0x004a
        L_0x0045:
            if (r5 == 0) goto L_0x004a
            r5.release()
        L_0x004a:
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            r6.setVideoThumbnail(r4)
        L_0x0053:
            r6.setVideoDuration(r2)
            return
        L_0x0057:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x005f
            r0 = 2
            long r7 = r2 / r0
        L_0x005f:
            r6.setVideoThumbnail(r7)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupportbloks.components.BloksSupportVideoView.A01(com.whatsapp.inappsupportbloks.components.BloksSupportVideoView, long):void");
    }

    public void A07() {
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = AnonymousClass3MZ.A0d(A0O);
            this.A01 = AnonymousClass10E.A12(A0O);
            this.A08 = C000200d.A00(A0O.A00.AHv);
            this.A07 = AnonymousClass10E.AL1(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass11E getConnectivityStateProvider() {
        AnonymousClass11E r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("connectivityStateProvider");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass00H getSupportVideoLogger() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("supportVideoLogger");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    private final void A00() {
        View inflate = View.inflate(getContext(), 2131625778, this);
        C42491yG.A05(inflate.findViewById(2131434739), getResources().getDimension(2131167105));
        this.A03 = (WaImageView) AnonymousClass3MX.A0C(inflate, 2131436769);
        this.A02 = (WaImageView) AnonymousClass3MX.A0C(inflate, 2131433885);
        AnonymousClass1FY r2 = (AnonymousClass1FY) AnonymousClass3Ma.A05(this);
        r2.A4P(this.A05);
        WaImageView waImageView = this.A02;
        if (waImageView == null) {
            C18070vi.A11("playButton");
            throw null;
        }
        AnonymousClass3MZ.A1O(waImageView, r2, this, 0);
        this.A04 = C72453Mb.A0g(inflate, 2131430196);
    }

    private final void setVideoDuration(long j) {
        getGlobalUI().A0J(new AnonymousClass3C8(this, AnonymousClass000.A10(), new Formatter(AnonymousClass000.A10(), Locale.getDefault()), 7, j));
    }

    private final void setVideoInformation(long j) {
        getWaWorkers().CGF(new C146487Ph(this, j, 18));
    }

    private final void setVideoThumbnail(long j) {
        getWaWorkers().CGF(new C146487Ph(this, j, 17));
    }

    public BloksSupportVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A07();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A07();
        this.A05 = new AnonymousClass7C8(this);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A07();
        this.A05 = new AnonymousClass7C8(this);
        A00();
    }
}
