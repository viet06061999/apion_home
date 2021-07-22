package com.apion.apionhome.data.source

import com.apion.apionhome.data.model.community.Community
import com.apion.apionhome.data.model.community.Participant
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Maybe

interface CommunityDatasource {

    interface Remote {
        fun getAllCommunities(): Maybe<List<Community>>
        fun getCommunityById(id: Int): Maybe<Community>
        fun createCommunity(community: Community): Maybe<Community>
        fun updateCommunity(community: Community): Maybe<Community>

        fun getAllParticipants(): Maybe<List<Participant>>
        fun getParticipantById(id: Int): Maybe<Participant>
        fun createParticipant(userId: Int, communityId: Int): Maybe<Participant>
        fun updateParticipant(userId: Int, communityId: Int): Maybe<Participant>
        fun leaveCommunity(userId: Int, communityId: Int): Completable
    }
}