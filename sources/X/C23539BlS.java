package X;

import java.util.Map;

/* renamed from: X.BlS  reason: case insensitive filesystem */
public final class C23539BlS extends DVG {
    public final Object key;
    public int lastKnownIndex;
    public final /* synthetic */ C27301DbX this$0;

    public C23539BlS(C27301DbX dbX, int i) {
        this.this$0 = dbX;
        this.key = dbX.key(i);
        this.lastKnownIndex = i;
    }

    private void updateLastKnownIndex() {
        int i = this.lastKnownIndex;
        if (i == -1 || i >= this.this$0.size() || !C24604CBi.A00(this.key, this.this$0.key(this.lastKnownIndex))) {
            this.lastKnownIndex = this.this$0.indexOf(this.key);
        }
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        Map delegateOrNull = this.this$0.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(this.key);
        }
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            return C24607CBl.unsafeNull();
        }
        return this.this$0.value(i);
    }

    public Object setValue(Object obj) {
        Map delegateOrNull = this.this$0.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(this.key, obj);
        }
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            this.this$0.put(this.key, obj);
            return C24607CBl.unsafeNull();
        }
        Object access$600 = this.this$0.value(i);
        this.this$0.setValue(this.lastKnownIndex, obj);
        return access$600;
    }
}
