package X;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

/* renamed from: X.7Na  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145897Na implements C38531rR {
    public final /* synthetic */ AnonymousClass1DC A00;
    public final /* synthetic */ AnonymousClass7OH A01;
    public final /* synthetic */ C130456jS A02;

    public final void Bvu(View view) {
        AnonymousClass7OH r2 = this.A01;
        C130456jS r1 = this.A02;
        r2.A00 = AnonymousClass1HF.A06(view, 2131436887);
        C18070vi.A0d(view, 0);
        r1.A01 = C17880vN.A0E(view, 2131436893);
        r1.A00 = (ImageButton) view.findViewById(2131436887);
        TextView textView = r1.A01;
        if (textView != null) {
            textView.setImportantForAccessibility(2);
        }
        r2.A05 = (VoiceNoteSeekBar) AnonymousClass1HF.A06(view, 2131436891);
        r2.A03 = (VoiceVisualizer) AnonymousClass1HF.A06(view, 2131436888);
    }

    public /* synthetic */ C145897Na(AnonymousClass1DC r1, AnonymousClass7OH r2, C130456jS r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
