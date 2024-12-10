package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.mediacomposer.VideoTimelineView;

/* renamed from: X.5eP  reason: invalid class name and case insensitive filesystem */
public abstract class C109935eP extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static void A00(VideoTimelineView videoTimelineView) {
        videoTimelineView.A00 = 1.0f;
        videoTimelineView.A03 = -1;
        videoTimelineView.A01 = 12.0f;
        videoTimelineView.A06 = -1;
        videoTimelineView.A02 = 12.0f;
        videoTimelineView.A07 = -1;
        videoTimelineView.A04 = 855638016;
    }

    public void A05() {
        if (!this.A01) {
            this.A01 = true;
            VideoTimelineView videoTimelineView = (VideoTimelineView) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            videoTimelineView.A0H = AnonymousClass10E.AL1(r1);
            videoTimelineView.A0C = AnonymousClass10E.A6O(r1);
            videoTimelineView.A0D = AnonymousClass10E.A6Q(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C109935eP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }
}
