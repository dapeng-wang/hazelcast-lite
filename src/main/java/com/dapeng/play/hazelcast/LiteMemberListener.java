package com.dapeng.play.hazelcast;

import com.hazelcast.cluster.MembershipEvent;
import com.hazelcast.cluster.MembershipListener;

public class LiteMemberListener implements MembershipListener {
    @Override
    public void memberAdded(MembershipEvent membershipEvent) {
        System.out.println("Member joined " + membershipEvent.getMember());
    }

    @Override
    public void memberRemoved(MembershipEvent membershipEvent) {
        System.out.println("Member removed " + membershipEvent.getMember());
    }
}
