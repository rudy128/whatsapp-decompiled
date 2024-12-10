package com.whatsapp.music.musiceditor.ui;

import X.C18070vi;
import X.C28281Zt;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatDialogFragment;

public abstract class MusicBaseDialogFragment extends AppCompatDialogFragment {
    public LayoutInflater A1o(Bundle bundle) {
        LayoutInflater A1o = super.A1o(bundle);
        if (Build.VERSION.SDK_INT >= 29) {
            A1o = A1o.cloneInContext(C28281Zt.A01(A14()));
        }
        C18070vi.A0b(A1o);
        return A1o;
    }
}
