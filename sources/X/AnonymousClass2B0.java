package X;

/* renamed from: X.2B0  reason: invalid class name */
public final class AnonymousClass2B0 extends C23624Bmt implements AnonymousClass3MI {
    public AnonymousClass2B0() {
        super(AnonymousClass2BZ.DEFAULT_INSTANCE);
    }

    public long BMS() {
        return ((AnonymousClass2BZ) this.A00).activeModeUptimeMillis_;
    }

    public int BNB() {
        return ((AnonymousClass2BZ) this.A00).attemptNumber_;
    }

    public long BPD() {
        return ((AnonymousClass2BZ) this.A00).connectServerTimeMillis_;
    }

    public long BPE() {
        return ((AnonymousClass2BZ) this.A00).connectUptimeMillis_;
    }

    public boolean BQi() {
        return ((AnonymousClass2BZ) this.A00).disconnected_;
    }

    public AnonymousClass2BJ BRS() {
        AnonymousClass2BJ r0 = ((AnonymousClass2BZ) this.A00).expected_;
        if (r0 == null) {
            return AnonymousClass2BJ.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public long BRk() {
        return ((AnonymousClass2BZ) this.A00).firstAttemptConnectUptimeMillis_;
    }

    public boolean BTN() {
        return ((AnonymousClass2BZ) this.A00).isOfflineCompleteReceived_;
    }

    public long BTs() {
        return ((AnonymousClass2BZ) this.A00).lastStanzaReceivedUptimeMillis_;
    }

    public long BVa() {
        return ((AnonymousClass2BZ) this.A00).offlinePreviewUptimeMillis_;
    }

    public long BVd() {
        return ((AnonymousClass2BZ) this.A00).oldestStanzaTimeMillis_;
    }

    public boolean BVl() {
        return ((AnonymousClass2BZ) this.A00).onTrickleMode_;
    }

    public AnonymousClass2BJ BXy() {
        AnonymousClass2BJ r0 = ((AnonymousClass2BZ) this.A00).received_;
        if (r0 == null) {
            return AnonymousClass2BJ.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public String BZ4() {
        return ((AnonymousClass2BZ) this.A00).sessionId_;
    }

    public boolean BZZ() {
        return ((AnonymousClass2BZ) this.A00).startedOnForeground_;
    }

    public boolean BcV() {
        return ((AnonymousClass2BZ) this.A00).BcV();
    }

    public boolean Bce() {
        return ((AnonymousClass2BZ) this.A00).Bce();
    }
}
