package kr.funnydev.springbootplayground.web;

import kr.funnydev.springbootplayground.service.PostsService;
import kr.funnydev.springbootplayground.web.dto.PostsSaveRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDTO requestDto) {
        return postsService.save(requestDto);
    }
}
