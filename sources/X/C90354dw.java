package X;

import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.conversation.ConversationEntryActionButton;

/* renamed from: X.4dw  reason: invalid class name and case insensitive filesystem */
public class C90354dw implements View.OnTouchListener, View.OnLongClickListener {
    public boolean A00 = false;
    public PointF A01 = null;
    public boolean A02 = false;
    public final Handler A03 = new Handler();
    public final /* synthetic */ View.OnTouchListener A04;
    public final /* synthetic */ ConversationEntryActionButton A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ Runnable A07;

    public C90354dw(View.OnTouchListener onTouchListener, ConversationEntryActionButton conversationEntryActionButton, Runnable runnable, Runnable runnable2) {
        this.A05 = conversationEntryActionButton;
        this.A06 = runnable;
        this.A04 = onTouchListener;
        this.A07 = runnable2;
    }

    public static boolean A00(C90354dw r3) {
        if (!r3.A02) {
            return false;
        }
        AnonymousClass3V4 r0 = r3.A05.A04;
        if (r0 != null) {
            r0.A0Y(false);
        }
        r3.A01 = null;
        r3.A02 = false;
        r3.A00 = false;
        r3.A03.removeCallbacksAndMessages((Object) null);
        r3.A07.run();
        return true;
    }

    public boolean onLongClick(View view) {
        return A00(this);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        PointF pointF = null;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        AnonymousClass3V4 r0 = this.A05.A04;
                        if (r0 != null) {
                            r0.A0Y(false);
                        }
                    }
                } else if (this.A01 != null) {
                    ConversationEntryActionButton conversationEntryActionButton = this.A05;
                    if (conversationEntryActionButton.A0C != null) {
                        float x = motionEvent.getX() - this.A01.x;
                        float y = motionEvent.getY() - this.A01.y;
                        if (((float) Math.sqrt((double) ((x * x) + (y * y)))) > ((float) conversationEntryActionButton.A0C.intValue())) {
                            A00(this);
                        }
                    }
                }
            } else if (this.A00) {
                this.A00 = false;
                this.A06.run();
            }
            this.A03.removeCallbacksAndMessages((Object) null);
        } else {
            ConversationEntryActionButton conversationEntryActionButton2 = this.A05;
            AnonymousClass4VJ r1 = conversationEntryActionButton2.A04.A01;
            if (!r1.A09 && !r1.A0G) {
                z = true;
            }
            this.A02 = true;
            if (!z && conversationEntryActionButton2.A0C != null) {
                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            }
            this.A01 = pointF;
            if (z) {
                A00(this);
            }
            this.A00 = true;
            this.A03.postDelayed(new AnonymousClass7RK(34, (Object) this, z), conversationEntryActionButton2.getShortTapTimeoutMs());
        }
        return this.A04.onTouch(view, motionEvent);
    }
}
