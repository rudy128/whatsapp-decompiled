package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.event.ChatInfoEventsCard;
import com.whatsapp.info.views.ChatInfoMediaCardV2;
import com.whatsapp.ui.media.MediaCardGrid;

/* renamed from: X.3QZ  reason: invalid class name */
public abstract class AnonymousClass3QZ extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A01() {
        if (this instanceof ChatInfoEventsCard) {
            ChatInfoEventsCard chatInfoEventsCard = (ChatInfoEventsCard) this;
            if (!chatInfoEventsCard.A02) {
                chatInfoEventsCard.A02 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(chatInfoEventsCard);
                chatInfoEventsCard.A01 = C000200d.A00(A0X.A3m);
                chatInfoEventsCard.A00 = AnonymousClass10E.A6Q(A0X);
            }
        } else if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            if (!mediaCardGrid.A03) {
                mediaCardGrid.A03 = true;
                mediaCardGrid.A03 = C72473Md.A0S(AnonymousClass3MX.A0T(mediaCardGrid));
            }
        } else if (this instanceof AnonymousClass48T) {
            AnonymousClass48T r1 = (AnonymousClass48T) this;
            if (r1 instanceof ChatInfoMediaCardV2) {
                ChatInfoMediaCardV2 chatInfoMediaCardV2 = (ChatInfoMediaCardV2) r1;
                if (!chatInfoMediaCardV2.A00) {
                    chatInfoMediaCardV2.A00 = true;
                    chatInfoMediaCardV2.A03 = C72473Md.A0S(AnonymousClass3MX.A0T(chatInfoMediaCardV2));
                }
            } else if (!r1.A00) {
                r1.A00 = true;
                r1.A03 = C72473Md.A0S(AnonymousClass3MX.A0T(r1));
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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

    public AnonymousClass3QZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
