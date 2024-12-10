package X;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.bot.commands.BotCommandsPickerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.5UV  reason: invalid class name */
public final class AnonymousClass5UV extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass3UN $botCommandTextViewModel;
    public final /* synthetic */ C92954iC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UV(C92954iC r2, AnonymousClass3UN r3) {
        super(1);
        this.this$0 = r2;
        this.$botCommandTextViewModel = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4YU r12 = (AnonymousClass4YU) obj;
        if (r12.A03) {
            List list = r12.A02;
            if (list == null) {
                BotCommandsPickerView botCommandsPickerView = this.this$0.A00;
                if (botCommandsPickerView != null) {
                    botCommandsPickerView.A02.A02(botCommandsPickerView.A09, true);
                }
            } else {
                if (true ^ list.isEmpty()) {
                    list.size();
                }
                C92954iC r8 = this.this$0;
                Bitmap bitmap = r12.A00;
                UserJid userJid = r12.A01;
                AnonymousClass3UN r10 = this.$botCommandTextViewModel;
                r8.A01 = userJid;
                if (r8.A00 == null) {
                    MentionableEntry mentionableEntry = r8.A05;
                    LayoutInflater A0D = AnonymousClass3MZ.A0D(mentionableEntry);
                    ViewGroup viewGroup = r8.A02;
                    View A09 = AnonymousClass3MX.A09(A0D, viewGroup, 2131624305);
                    C18070vi.A0X(A09);
                    if (A09 instanceof BotCommandsPickerView) {
                        r8.A00 = (BotCommandsPickerView) A09;
                        if (viewGroup != null) {
                            viewGroup.addView(A09);
                        }
                    }
                    BotCommandsPickerView botCommandsPickerView2 = r8.A00;
                    if (botCommandsPickerView2 != null) {
                        botCommandsPickerView2.setupView(list, bitmap, mentionableEntry.A05, r8, userJid, r10);
                    }
                }
                BotCommandsPickerView botCommandsPickerView3 = this.this$0.A00;
                if (botCommandsPickerView3 != null) {
                    botCommandsPickerView3.setCommandList(list, bitmap);
                }
            }
        }
        return C27621Wu.A00;
    }
}
