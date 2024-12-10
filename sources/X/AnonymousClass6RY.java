package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.6RY  reason: invalid class name */
public enum AnonymousClass6RY {
    CALL_ENDED(1),
    STOP_FROM_BOTTOM_SHEET(2),
    STOP_FROM_GRID_TILE(4),
    PEER_TAKEOVER(16),
    ERROR(128),
    DISPLAY_PENDING_CALL(512),
    SCREEN_LOCKED(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH),
    OTHER(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        AnonymousClass6RY[] r1;
        A00 = C19780yz.A00(r1);
    }

    /* access modifiers changed from: public */
    AnonymousClass6RY(int i) {
        this.value = i;
    }
}
