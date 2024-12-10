package X;

import android.view.ViewGroup;
import com.whatsapp.bot.commands.BotCommandsPickerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.4iC  reason: invalid class name and case insensitive filesystem */
public final class C92954iC implements C106615Wn {
    public BotCommandsPickerView A00;
    public UserJid A01;
    public final ViewGroup A02;
    public final C32951i1 A03;
    public final C34811l7 A04;
    public final MentionableEntry A05;

    public C92954iC(ViewGroup viewGroup, AnonymousClass1F9 r5, C32951i1 r6, C34811l7 r7, MentionableEntry mentionableEntry, AnonymousClass3UN r9) {
        C72473Md.A1I(mentionableEntry, r5);
        C72473Md.A1J(r6, r7);
        this.A05 = mentionableEntry;
        this.A02 = viewGroup;
        this.A03 = r6;
        this.A04 = r7;
        AnonymousClass3MY.A1K(r5, r9.A05, new AnonymousClass5UV(this, r9), 10);
        mentionableEntry.addTextChangedListener(new AnonymousClass48D(this, r9));
        mentionableEntry.A0G = new C96834oU(this, r9);
    }
}
