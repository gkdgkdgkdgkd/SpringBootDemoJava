package com.example.demo.group.groups.group;

import com.example.demo.group.groups.sequence.SignInFirstCheck;
import com.example.demo.group.groups.sequence.SignInSecondCheck;
import com.example.demo.group.groups.sequence.SignInThirdCheck;

import javax.validation.GroupSequence;

@GroupSequence({SignInFirstCheck.class, SignInSecondCheck.class, SignInThirdCheck.class})
public interface SignInCheckSequenceGroup {
}
