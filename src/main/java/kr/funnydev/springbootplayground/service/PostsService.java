package kr.funnydev.springbootplayground.service;

import kr.funnydev.springbootplayground.domain.posts.PostsRepository;
import kr.funnydev.springbootplayground.web.dto.PostsSaveRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDTO requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
